<<<<<<< HEAD
package in.vamsoft.excersise1.shape;

/**
 * creating CircleTest2 as class.
 * @author JK
 *
 */
public class CircleTest2 {
/**
  * The main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      double radius = 10 * Math.random();
      System.out.println("Circle " + i);
      System.out.println("Generated radius:    "
                         + radius);
      Circle c = new Circle(radius);
      System.out.print("Stored info: ");
      c.printInfo();
      System.out.println();
    }
  }
=======
package in.vamsoft.excersise1.shape;
/*
 * @author vignesh
 */
public class CircleTest2 {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      double radius = 10*Math.random();
      Circle c = new Circle(radius);
      System.out.println("Circle " + i);
      System.out.println("Generated radius:    "
                         + radius);
      System.out.print("Stored info: ");
      c.printInfo();
      System.out.println();
    }
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}