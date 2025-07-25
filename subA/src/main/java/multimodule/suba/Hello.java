package multimodule.suba;

import multimodule.common.Greeting;

/**
 * This is the Greeting implementation in subA
 */
public class Hello implements Greeting {

  /**
   * Default constructor.
   */
  public Hello() {}

  @Override
  public String greet(String name) {
    return "Hello $name from suba";
  }
}
