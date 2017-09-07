<<<<<<< HEAD
package in.vamsoft.excersise1.shape;

/**
 * creating CircleTest3 as class.
 * @author JK
 *
 */
public class CircleTest3 {

 /**
  * The main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    Circle[] circles = new Circle[100];
    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle(10 * Math.random());
    }
    double minArea = Double.MAX_VALUE;
    double maxArea = 0;
    double sum = 0;
    for (Circle c: circles) {
      double area = c.getArea();
      if (area < minArea) {
        minArea = area;
      }
      if (area > maxArea) {
        maxArea = area;
      }
      sum = sum + area;
    }
    System.out.println("Smallest area: " + minArea);
    System.out.println("Largest area:  " + maxArea);
    System.out.println("Sum of areas:  " + sum);
  }
=======
package in.vamsoft.excersise1.shape;
/*
 * @author vignesh
 */
public class CircleTest3 {
  public static void main(String[] args) {
    Circle[] circles = new Circle[100];
    for(int i=0; i<circles.length; i++) {
      circles[i] = new Circle(10*Math.random());
    }
    double minArea = Double.MAX_VALUE;
    double maxArea = 0;
    double sum = 0;
    for(Circle c: circles) {
      double area = c.getArea();
      if (area < minArea) {
        minArea = area;
      }
      if (area > maxArea) {
        maxArea = area;
      }
      sum = sum + area;
    }
    System.out.println("Smallest area: " + minArea);
    System.out.println("Largest area:  " + maxArea);
    System.out.println("Sum of areas:  " + sum);
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}