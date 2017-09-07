package in.vamsoft.excersise3;
/*
 * @author vignesh
 */

public class Circle extends Shape {
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

 
  
  public double getRadius() {
    return(radius);
  }

 
  
  public void setRadius(double radius) {
    this.radius = radius;
  }

 
  @Override
  public double getArea() {
    return(Math.PI * radius * radius);
  }


  @Override
  public void printInfo() {
    System.out.println("Radius: " + getRadius() +
                       ", Area: " + getArea());
  }

  public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}