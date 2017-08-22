package in.vamsoft.excersise1.shape1;
/*
 * @author vignesh
 */
public class Circle {
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

  public double getArea() {
    return(Math.PI * radius * radius);
  }


  public String toString() {
    return("Circle (radius=" + radius + 
           ", area=" + getArea() + ")");
  }
  
 public void setArea(double area) {
    radius = Math.sqrt(area / Math.PI);
  }
}