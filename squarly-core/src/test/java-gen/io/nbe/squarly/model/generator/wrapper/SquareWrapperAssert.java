package io.nbe.squarly.model.generator.wrapper;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link SquareWrapper} specific assertions - Generated by CustomAssertionGenerator.
 */
public class SquareWrapperAssert extends AbstractAssert<SquareWrapperAssert, SquareWrapper> {

  /**
   * Creates a new <code>{@link SquareWrapperAssert}</code> to make assertions on actual SquareWrapper.
   * @param actual the SquareWrapper we want to make assertions on.
   */
  public SquareWrapperAssert(SquareWrapper actual) {
    super(actual, SquareWrapperAssert.class);
  }

  /**
   * An entry point for SquareWrapperAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(mySquareWrapper)</code> and get specific assertion with code completion.
   * @param actual the SquareWrapper we want to make assertions on.
   * @return a new <code>{@link SquareWrapperAssert}</code>
   */
  public static SquareWrapperAssert assertThat(SquareWrapper actual) {
    return new SquareWrapperAssert(actual);
  }

  /**
   * Verifies that the actual SquareWrapper's cord is equal to the given one.
   * @param cord the given cord to compare the actual SquareWrapper's cord to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper's cord is not equal to the given one.
   */
  public SquareWrapperAssert hasCord(io.nbe.squarly.model.Cord cord) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting cord of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    io.nbe.squarly.model.Cord actualCord = actual.getCord();
    if (!Objects.areEqual(actualCord, cord)) {
      failWithMessage(assertjErrorMessage, actual, cord, actualCord);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's diagonals contains the given SquareWrapper elements.
   * @param diagonals the given elements that should be contained in actual SquareWrapper's diagonals.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's diagonals does not contain all given SquareWrapper elements.
   */
  public SquareWrapperAssert hasDiagonals(SquareWrapper... diagonals) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given SquareWrapper varargs is not null.
    if (diagonals == null) failWithMessage("Expecting diagonals parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getDiagonals(), diagonals);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's diagonals contains <b>only<b> the given SquareWrapper elements and nothing else in whatever order.
   * @param diagonals the given elements that should be contained in actual SquareWrapper's diagonals.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's diagonals does not contain all given SquareWrapper elements.
   */
  public SquareWrapperAssert hasOnlyDiagonals(SquareWrapper... diagonals) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given SquareWrapper varargs is not null.
    if (diagonals == null) failWithMessage("Expecting diagonals parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getDiagonals(), diagonals);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's diagonals does not contain the given SquareWrapper elements.
   *
   * @param diagonals the given elements that should not be in actual SquareWrapper's diagonals.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's diagonals contains any given SquareWrapper elements.
   */
  public SquareWrapperAssert doesNotHaveDiagonals(SquareWrapper... diagonals) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given SquareWrapper varargs is not null.
    if (diagonals == null) failWithMessage("Expecting diagonals parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getDiagonals(), diagonals);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper has no diagonals.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's diagonals is not empty.
   */
  public SquareWrapperAssert hasNoDiagonals() {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have diagonals but had :\n  <%s>";
    
    // check
    if (actual.getDiagonals().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getDiagonals());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual SquareWrapper's gameMap is equal to the given one.
   * @param gameMap the given gameMap to compare the actual SquareWrapper's gameMap to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper's gameMap is not equal to the given one.
   */
  public SquareWrapperAssert hasGameMap(io.nbe.squarly.model.interfaces.IGameMap gameMap) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting gameMap of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    io.nbe.squarly.model.interfaces.IGameMap actualGameMap = actual.getGameMap();
    if (!Objects.areEqual(actualGameMap, gameMap)) {
      failWithMessage(assertjErrorMessage, actual, gameMap, actualGameMap);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's gmw is equal to the given one.
   * @param gmw the given gmw to compare the actual SquareWrapper's gmw to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper's gmw is not equal to the given one.
   */
  public SquareWrapperAssert hasGmw(GameMapWrapper gmw) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting gmw of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    GameMapWrapper actualGmw = actual.getGmw();
    if (!Objects.areEqual(actualGmw, gmw)) {
      failWithMessage(assertjErrorMessage, actual, gmw, actualGmw);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's neighbors contains the given io.nbe.squarly.model.interfaces.ICoordinateSquare elements.
   * @param neighbors the given elements that should be contained in actual SquareWrapper's neighbors.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighbors does not contain all given io.nbe.squarly.model.interfaces.ICoordinateSquare elements.
   */
  public SquareWrapperAssert hasNeighbors(io.nbe.squarly.model.interfaces.ICoordinateSquare... neighbors) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given io.nbe.squarly.model.interfaces.ICoordinateSquare varargs is not null.
    if (neighbors == null) failWithMessage("Expecting neighbors parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getNeighbors(), neighbors);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's neighbors contains <b>only<b> the given io.nbe.squarly.model.interfaces.ICoordinateSquare elements and nothing else in whatever order.
   * @param neighbors the given elements that should be contained in actual SquareWrapper's neighbors.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighbors does not contain all given io.nbe.squarly.model.interfaces.ICoordinateSquare elements.
   */
  public SquareWrapperAssert hasOnlyNeighbors(io.nbe.squarly.model.interfaces.ICoordinateSquare... neighbors) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given io.nbe.squarly.model.interfaces.ICoordinateSquare varargs is not null.
    if (neighbors == null) failWithMessage("Expecting neighbors parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getNeighbors(), neighbors);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's neighbors does not contain the given io.nbe.squarly.model.interfaces.ICoordinateSquare elements.
   *
   * @param neighbors the given elements that should not be in actual SquareWrapper's neighbors.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighbors contains any given io.nbe.squarly.model.interfaces.ICoordinateSquare elements.
   */
  public SquareWrapperAssert doesNotHaveNeighbors(io.nbe.squarly.model.interfaces.ICoordinateSquare... neighbors) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given io.nbe.squarly.model.interfaces.ICoordinateSquare varargs is not null.
    if (neighbors == null) failWithMessage("Expecting neighbors parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getNeighbors(), neighbors);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper has no neighbors.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighbors is not empty.
   */
  public SquareWrapperAssert hasNoNeighbors() {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have neighbors but had :\n  <%s>";
    
    // check
    if (actual.getNeighbors().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getNeighbors());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual SquareWrapper's neighs contains the given SquareWrapper elements.
   * @param neighs the given elements that should be contained in actual SquareWrapper's neighs.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighs does not contain all given SquareWrapper elements.
   */
  public SquareWrapperAssert hasNeighs(SquareWrapper... neighs) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given SquareWrapper varargs is not null.
    if (neighs == null) failWithMessage("Expecting neighs parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getNeighs(), neighs);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's neighs contains <b>only<b> the given SquareWrapper elements and nothing else in whatever order.
   * @param neighs the given elements that should be contained in actual SquareWrapper's neighs.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighs does not contain all given SquareWrapper elements.
   */
  public SquareWrapperAssert hasOnlyNeighs(SquareWrapper... neighs) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given SquareWrapper varargs is not null.
    if (neighs == null) failWithMessage("Expecting neighs parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getNeighs(), neighs);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's neighs does not contain the given SquareWrapper elements.
   *
   * @param neighs the given elements that should not be in actual SquareWrapper's neighs.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighs contains any given SquareWrapper elements.
   */
  public SquareWrapperAssert doesNotHaveNeighs(SquareWrapper... neighs) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check that given SquareWrapper varargs is not null.
    if (neighs == null) failWithMessage("Expecting neighs parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getNeighs(), neighs);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper has no neighs.
   * @return this assertion object.
   * @throws AssertionError if the actual SquareWrapper's neighs is not empty.
   */
  public SquareWrapperAssert hasNoNeighs() {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have neighs but had :\n  <%s>";
    
    // check
    if (actual.getNeighs().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getNeighs());
    }
    
    // return the current assertion for method chaining
    return this;
  }
  

  /**
   * Verifies that the actual SquareWrapper's state is equal to the given one.
   * @param state the given state to compare the actual SquareWrapper's state to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper's state is not equal to the given one.
   */
  public SquareWrapperAssert hasState(io.nbe.squarly.model.interfaces.IState state) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting state of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    io.nbe.squarly.model.interfaces.IState actualState = actual.getState();
    if (!Objects.areEqual(actualState, state)) {
      failWithMessage(assertjErrorMessage, actual, state, actualState);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper's t is equal to the given one.
   * @param t the given t to compare the actual SquareWrapper's t to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper's t is not equal to the given one.
   */
  public SquareWrapperAssert hasT(io.nbe.squarly.model.interfaces.ICoordinateSquare t) {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting t of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    io.nbe.squarly.model.interfaces.ICoordinateSquare actualT = actual.getT();
    if (!Objects.areEqual(actualT, t)) {
      failWithMessage(assertjErrorMessage, actual, t, actualT);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper is opaque.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper is not opaque.
   */
  public SquareWrapperAssert isOpaque() {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isOpaque()) {
      failWithMessage("\nExpecting that actual SquareWrapper is opaque but is not.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper is not opaque.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper is opaque.
   */
  public SquareWrapperAssert isNotOpaque() {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isOpaque()) {
      failWithMessage("\nExpecting that actual SquareWrapper is not opaque but is.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper is visited.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper is not visited.
   */
  public SquareWrapperAssert isVisited() {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isVisited()) {
      failWithMessage("\nExpecting that actual SquareWrapper is visited but is not.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SquareWrapper is not visited.
   * @return this assertion object.
   * @throws AssertionError - if the actual SquareWrapper is visited.
   */
  public SquareWrapperAssert isNotVisited() {
    // check that actual SquareWrapper we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isVisited()) {
      failWithMessage("\nExpecting that actual SquareWrapper is not visited but is.");
    }
    
    // return the current assertion for method chaining
    return this;
  }

}