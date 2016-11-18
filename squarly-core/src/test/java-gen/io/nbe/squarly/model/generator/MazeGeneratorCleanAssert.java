package io.nbe.squarly.model.generator;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * {@link MazeGeneratorClean} specific assertions - Generated by CustomAssertionGenerator.
 */
public class MazeGeneratorCleanAssert extends AbstractAssert<MazeGeneratorCleanAssert, MazeGeneratorClean> {

  /**
   * Creates a new <code>{@link MazeGeneratorCleanAssert}</code> to make assertions on actual MazeGeneratorClean.
   * @param actual the MazeGeneratorClean we want to make assertions on.
   */
  public MazeGeneratorCleanAssert(MazeGeneratorClean actual) {
    super(actual, MazeGeneratorCleanAssert.class);
  }

  /**
   * An entry point for MazeGeneratorCleanAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myMazeGeneratorClean)</code> and get specific assertion with code completion.
   * @param actual the MazeGeneratorClean we want to make assertions on.
   * @return a new <code>{@link MazeGeneratorCleanAssert}</code>
   */
  public static MazeGeneratorCleanAssert assertThat(MazeGeneratorClean actual) {
    return new MazeGeneratorCleanAssert(actual);
  }

  /**
   * Verifies that the actual MazeGeneratorClean's gameGenerator is equal to the given one.
   * @param gameGenerator the given gameGenerator to compare the actual MazeGeneratorClean's gameGenerator to.
   * @return this assertion object.
   * @throws AssertionError - if the actual MazeGeneratorClean's gameGenerator is not equal to the given one.
   */
  public MazeGeneratorCleanAssert hasGameGenerator(io.nbe.squarly.model.GameGenerator gameGenerator) {
    // check that actual MazeGeneratorClean we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting gameGenerator of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    io.nbe.squarly.model.GameGenerator actualGameGenerator = actual.getGameGenerator();
    if (!Objects.areEqual(actualGameGenerator, gameGenerator)) {
      failWithMessage(assertjErrorMessage, actual, gameGenerator, actualGameGenerator);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual MazeGeneratorClean's mapWrapper is equal to the given one.
   * @param mapWrapper the given mapWrapper to compare the actual MazeGeneratorClean's mapWrapper to.
   * @return this assertion object.
   * @throws AssertionError - if the actual MazeGeneratorClean's mapWrapper is not equal to the given one.
   */
  public MazeGeneratorCleanAssert hasMapWrapper(io.nbe.squarly.model.generator.wrapper.GameMapWrapper mapWrapper) {
    // check that actual MazeGeneratorClean we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting mapWrapper of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    io.nbe.squarly.model.generator.wrapper.GameMapWrapper actualMapWrapper = actual.getMapWrapper();
    if (!Objects.areEqual(actualMapWrapper, mapWrapper)) {
      failWithMessage(assertjErrorMessage, actual, mapWrapper, actualMapWrapper);
    }

    // return the current assertion for method chaining
    return this;
  }

}