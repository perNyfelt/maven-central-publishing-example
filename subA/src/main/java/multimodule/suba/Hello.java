package multimodule.suba;

import multimodule.common.Greeting;

/**
 * This is the Greeting implementation in subA
 */
public class Hello implements Greeting {

  public String greet(String name) {
    return "Hello $name from suba";
  }
}
