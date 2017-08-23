package in.vamsoft.excersise1.shape1;

public class RectangleTest {

 /**
  * The main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
 public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      Rectangle r = new Rectangle(10 * Math.random(), 20 * Math.random());
      System.out.println(r);
    }
  }
}