<<<<<<< HEAD
package in.vamsoft.excersise1.shape;

/**
 * Creating RectangleTest as class.
 * @author JK
 *
 */
public class RectangleTest {

 /**
  * The main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      double width = 20 * Math.random();
      double height = 10 * Math.random();
      Rectangle r = new Rectangle(width, height);
      System.out.println("Rectangle " + i);
      System.out.println("Width:  " + r.width);
      System.out.println("Height: " + r.height);
      System.out.println("Area:   " + r.getArea());
      System.out.println();
    }
  }
=======
package in.vamsoft.excersise1.shape;
/*
 * @author vignesh
 */
public class RectangleTest {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      double width = 20*Math.random();
      double height = 10*Math.random();
      Rectangle r = new Rectangle(width, height);
      System.out.println("Rectangle " + i);
      System.out.println("Width:  " + r.width);
      System.out.println("Height: " + r.height);
      System.out.println("Area:   " + r.getArea());
      System.out.println();
    }
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}