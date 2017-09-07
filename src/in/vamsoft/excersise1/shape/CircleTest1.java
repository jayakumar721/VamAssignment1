package in.vamsoft.excersise1.shape;

/**
 * creating CircleTest1 as class.
 * @author JK
 *
 */
public class CircleTest1 {

 /**
  * The main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      double radius = 10 * Math.random();
      Circle c = new Circle(radius);
      System.out.println("Circle " + i);
      System.out.println("Generated radius: "
                         + radius);
      System.out.println("Stored radius:    "
                         + c.radius);
      System.out.println();
    }
  }
}