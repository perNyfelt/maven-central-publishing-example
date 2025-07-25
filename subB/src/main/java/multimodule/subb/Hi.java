package multimodule.subb;

import multimodule.common.Greeting;

/**
 * This is the Greeting implementation in subB.
 */
public class Hi implements Greeting {

  /**
   * Default constructor.
   */
  public Hi() {}

  public String greet(String name) {
    return "Hi $name from subB";
  }
}
