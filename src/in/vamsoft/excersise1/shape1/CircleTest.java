package in.vamsoft.excersise1.shape1;


public class CircleTest {
 /**
  * the main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Circle c = new Circle(10 * Math.random());
      System.out.println(c);
    }
  }
}