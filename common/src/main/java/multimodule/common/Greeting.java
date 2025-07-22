package multimodule.common;

/**
 * Common interface to define a greeting.
 */
public interface Greeting {

  String greet(String name);

  default void info() {
    System.out.println(this.getClass());
  }
}