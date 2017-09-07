package in.vamsoft.excersise1.shape1;

public class SquareTest {

 /**
  * The main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
 public static void main(String[] args) {
    System.out.println("Creating square with side 10");
    Square s = new Square(10);
    System.out.println(s);
    System.out.println("Setting width to 5");
    s.setWidth(5);
    System.out.println(s);
    System.out.println("Setting height to 6");
    s.setHeight(6);
    System.out.println(s);
    System.out.println("Setting area to 49");
    s.setArea(49);
    System.out.println(s);
  }
}