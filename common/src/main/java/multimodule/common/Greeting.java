package multimodule.common;

/**
 * Common interface to define a greeting.
 */
public interface Greeting {

  /**
   * Hello {name}.
   *
   * @param name the name to greet
   * @return Hello {name}
   */
  String greet(String name);

  /**
   * Prints some info.
   */
  default void info() {
    System.out.println(this.getClass());
  }
}