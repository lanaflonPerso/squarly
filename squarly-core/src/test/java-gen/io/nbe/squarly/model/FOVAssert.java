package io.nbe.squarly.model;

import org.assertj.core.api.AbstractAssert;

/**
 * {@link FOV} specific assertions - Generated by CustomAssertionGenerator.
 */
public class FOVAssert extends AbstractAssert<FOVAssert, FOV> {

  /**
   * Creates a new <code>{@link FOVAssert}</code> to make assertions on actual FOV.
   * @param actual the FOV we want to make assertions on.
   */
  public FOVAssert(FOV actual) {
    super(actual, FOVAssert.class);
  }

  /**
   * An entry point for FOVAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myFOV)</code> and get specific assertion with code completion.
   * @param actual the FOV we want to make assertions on.
   * @return a new <code>{@link FOVAssert}</code>
   */
  public static FOVAssert assertThat(FOV actual) {
    return new FOVAssert(actual);
  }

}