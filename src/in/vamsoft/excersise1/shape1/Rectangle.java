package in.vamsoft.excersise1.shape1;
public class Rectangle {
  private double width, height;

  /** Builds a Rectangle with the given width and height. */
  
  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Returns the width that was previously set. */
  
  public double getWidth() {
    return(width);
  }

  /** Sets the width. */
  
  public void setWidth(double width) {
    this.width = width;
  }

  /** Returns the height that was previously set. */
  
  public double getHeight() {
    return(height);
  }
  
  /** Sets the height. */

  public void setHeight(double height) {
    this.height = height;
  }

  /** Calculates and returns the area (width * height). */
  
  public double getArea() {
    return(width * height);
  }
  
  /** Prints info about the Rectangle. */
  
  @Override
  public String toString() {
    return("Rectangle (width=" + width + 
           ", height=" + height +
           ", area=" + getArea() + ")");
  }
}