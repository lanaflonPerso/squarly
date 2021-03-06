package io.nbe.squarly.model.generator.wrapper;

import io.nbe.squarly.model.Cord;
import io.nbe.squarly.model.Direction;
import io.nbe.squarly.model.interfaces.ICoordinateSquare;
import io.nbe.squarly.model.interfaces.IGameMap;
import io.nbe.squarly.model.interfaces.IState;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Nicolas Beaussart
 * @since 31/10/16
 */
public class SquareWrapper<T extends ICoordinateSquare> implements ICoordinateSquare {
    private T t;
    private GameMapWrapper gmw;
    Map<Direction, SquareWrapper<T>> neighs = new EnumMap<>(Direction.class);
    List<SquareWrapper<T>> diagonals = new ArrayList<>();

    private boolean visited = false;


    SquareWrapper(T t, GameMapWrapper<T> gmw){
        this.t = t;
        this.gmw = gmw;
        gmw.addSquare(this);
    }

    @Override
    public Cord getCord() {
        return t.getCord();
    }

    @Override
    public IGameMap<? extends ICoordinateSquare> getGameMap() {
        return t.getGameMap();
    }

    @Override
    public void setUpdated() {
        //t.getGameMap().setChanged(t);
    }

    @Override
    public IState getState() {
        return t.getState();
    }

    @Override
    public void setState(IState state) {
        t.setState(state);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public GameMapWrapper getGmw() {
        return gmw;
    }

    public List<SquareWrapper<T>> getNeighs() {
        return new ArrayList<>(neighs.values());
    }

    public List<SquareWrapper<T>> getNeighs(IState state) {
        return neighs.values().parallelStream().filter(squareWrapper -> squareWrapper.getState() == state).collect(Collectors.toList());
    }

    public List<SquareWrapper<T>> getDiagonals() {
        return diagonals;
    }

    public List<SquareWrapper<T>> getDiagonals(IState state) {
        return diagonals.parallelStream().filter(squareWrapper -> squareWrapper.getState() == state).collect(Collectors.toList());
    }


    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}