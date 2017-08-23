package in.vamsoft.excersise1.shape1;
public class Square extends Rectangle {
  
  /** Builds a Square with the given side as both its width and its height. */
  
  public Square(double side) {
    super(side, side);
  }

  private void setSides(double side) {
    super.setWidth(side);
    super.setHeight(side);
  }
  
  /** Sets BOTH the width and the height. */
  
  @Override
  public void setHeight(double height) {
    setSides(height);
  }
  
  /** Sets BOTH the width and the height. */
  
  @Override
  public void setWidth(double width) {
    setSides(width);
  }

  /** Indirectly sets the area by working backward to the side length.
   *  The resultant area may not be EXACTLY what you set, due to roundoff
   *  error when working with doubles.
   */
  public void setArea(double area) {
    setSides(Math.sqrt(area));
  }
  
  /** Prints info about the Square. */
  
  @Override
  public String toString() {
    return("Square (width/height=" + getWidth() + 
           ", area=" + getArea() + ")");
  }
}