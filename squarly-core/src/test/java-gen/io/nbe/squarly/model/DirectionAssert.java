package io.nbe.squarly.model;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link Direction} specific assertions - Generated by CustomAssertionGenerator.
 */
public class DirectionAssert extends AbstractAssert<DirectionAssert, Direction> {

  /**
   * Creates a new <code>{@link DirectionAssert}</code> to make assertions on actual Direction.
   * @param actual the Direction we want to make assertions on.
   */
  public DirectionAssert(Direction actual) {
    super(actual, DirectionAssert.class);
  }

  /**
   * An entry point for DirectionAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myDirection)</code> and get specific assertion with code completion.
   * @param actual the Direction we want to make assertions on.
   * @return a new <code>{@link DirectionAssert}</code>
   */
  public static DirectionAssert assertThat(Direction actual) {
    return new DirectionAssert(actual);
  }

  /**
   * Verifies that the actual Direction's cords is equal to the given one.
   * @param cords the given cords to compare the actual Direction's cords to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Direction's cords is not equal to the given one.
   */
  public DirectionAssert hasCords(Cord cords) {
    // check that actual Direction we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting cords of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Cord actualCords = actual.getCords();
    if (!Objects.areEqual(actualCords, cords)) {
      failWithMessage(assertjErrorMessage, actual, cords, actualCords);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Direction's opposite is equal to the given one.
   * @param opposite the given opposite to compare the actual Direction's opposite to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Direction's opposite is not equal to the given one.
   */
  public DirectionAssert hasOpposite(Direction opposite) {
    // check that actual Direction we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting opposite of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Direction actualOpposite = actual.getOpposite();
    if (!Objects.areEqual(actualOpposite, opposite)) {
      failWithMessage(assertjErrorMessage, actual, opposite, actualOpposite);
    }

    // return the current assertion for method chaining
    return this;
  }

}