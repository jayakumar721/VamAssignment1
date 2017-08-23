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
}