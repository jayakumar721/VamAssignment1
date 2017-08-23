package in.vamsoft.excersise1.shape;
public class Rectangle {
  public double width, height;

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return(width * height);
  }
}