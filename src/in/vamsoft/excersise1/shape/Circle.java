<<<<<<< HEAD
package in.vamsoft.excersise1.shape;

/**
 * creating Circle as class.
 * @author JK
 *
 */
public class Circle  {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return (Math.PI * radius * radius);
  }

  public void printInfo() {
    System.out.println("Radius: " + radius + ", Area: " + getArea());
  }

  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
=======
package in.vamsoft.excersise1.shape;
/*
 * @author vignesh
 */
public class Circle  {
  public double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return(Math.PI * radius * radius);
  }

  public void printInfo() {
    System.out.println("Radius: " + radius +
                       ", Area: " + getArea());
  }

  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}