package io.nbe.squarly.model.generator;

import io.nbe.squarly.model.generator.wrapper.GameMapWrapper;
import io.nbe.squarly.model.interfaces.ICoordinateSquare;
import io.nbe.squarly.model.interfaces.IState;
import io.nbe.squarly.model.Cord;
import io.nbe.squarly.model.GameGenerator;
import io.nbe.squarly.model.generator.wrapper.SquareWrapper;

import java.util.*;

/**
 * @author Nicolas Beaussart
 * @since 27/10/16
 */
public class MazeGeneratorClean<T extends ICoordinateSquare> extends AbsGenerator<T> {

    public MazeGeneratorClean(GameGenerator<T> gameGenerator) {
        super(gameGenerator);
    }

    public MazeGeneratorClean() {
        super();
    }

    @Override
    public void doGenerate() {
        GameMapWrapper<T> mapWrapper = getMapWrapper();

        List<SquareWrapper<T>> wallList = new ArrayList<>();
        Random r = new Random();

        Optional<SquareWrapper<T>> fromCords = mapWrapper.getFromCords(Cord.get(1, 1));

        if (fromCords.isPresent()) {
            fromCords.get().setState(IState.ROOM);
            wallList.addAll(fromCords.get().getNeighs(IState.WALL));

        } else {
            throw new IllegalStateException("The map is too small");
        }

        while (!wallList.isEmpty()){
            SquareWrapper<T> rmd = wallList.remove(r.nextInt(wallList.size()));

            if (rmd.getNeighs(IState.ROOM).size() == 1 &&
                    rmd.getDiagonals(IState.WALL).size() >= 6){
                rmd.setState(IState.ROOM);
                wallList.addAll(rmd.getNeighs(IState.WALL));
            }
        }

    }

    /*
    Start with a grid full of walls.
    Pick a cell, mark it as part of the maze. Add the walls of the cell to the wall list.
    While there are walls in the list:

        Pick a random wall from the list. If only one of the two cells that the wall divides is a room, then:
            Make the wall a passage and mark the unvisited cell as part of the maze.
            Add the neighboring walls of the cell to the wall list.
        Remove the wall from the list.

     */



}
