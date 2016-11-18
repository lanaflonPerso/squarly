package io.nbe.squarly.model;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link Color} specific assertions - Generated by CustomAssertionGenerator.
 */
public class ColorAssert extends AbstractAssert<ColorAssert, Color> {

  /**
   * Creates a new <code>{@link ColorAssert}</code> to make assertions on actual Color.
   * @param actual the Color we want to make assertions on.
   */
  public ColorAssert(Color actual) {
    super(actual, ColorAssert.class);
  }

  /**
   * An entry point for ColorAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myColor)</code> and get specific assertion with code completion.
   * @param actual the Color we want to make assertions on.
   * @return a new <code>{@link ColorAssert}</code>
   */
  public static ColorAssert assertThat(Color actual) {
    return new ColorAssert(actual);
  }

  /**
   * Verifies that the actual Color's awt is equal to the given one.
   * @param awt the given awt to compare the actual Color's awt to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Color's awt is not equal to the given one.
   */
  public ColorAssert hasAwt(java.awt.Color awt) {
    // check that actual Color we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting awt of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    java.awt.Color actualAwt = actual.getAwt();
    if (!Objects.areEqual(actualAwt, awt)) {
      failWithMessage(assertjErrorMessage, actual, awt, actualAwt);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Color's blue is equal to the given one.
   * @param blue the given blue to compare the actual Color's blue to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Color's blue is not equal to the given one.
   */
  public ColorAssert hasBlue(int blue) {
    // check that actual Color we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting blue of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualBlue = actual.getBlue();
    if (actualBlue != blue) {
      failWithMessage(assertjErrorMessage, actual, blue, actualBlue);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Color's green is equal to the given one.
   * @param green the given green to compare the actual Color's green to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Color's green is not equal to the given one.
   */
  public ColorAssert hasGreen(int green) {
    // check that actual Color we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting green of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualGreen = actual.getGreen();
    if (actualGreen != green) {
      failWithMessage(assertjErrorMessage, actual, green, actualGreen);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Color's red is equal to the given one.
   * @param red the given red to compare the actual Color's red to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Color's red is not equal to the given one.
   */
  public ColorAssert hasRed(int red) {
    // check that actual Color we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting red of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualRed = actual.getRed();
    if (actualRed != red) {
      failWithMessage(assertjErrorMessage, actual, red, actualRed);
    }

    // return the current assertion for method chaining
    return this;
  }

}