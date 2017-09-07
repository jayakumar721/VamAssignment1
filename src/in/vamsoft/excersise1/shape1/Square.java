<<<<<<< HEAD
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
    return ("Square (width/height=" + getWidth() + ", area=" + getArea() + ")");
  }
=======
package in.vamsoft.excersise1.shape1;
/*
 * @author vignesh
 */
 public class Square extends Rectangle {
  
  
  public Square(double side) {
    super(side, side);
  }

  private void setSides(double side) {
    super.setWidth(side);
    super.setHeight(side);
  }
  
  public void setHeight(double height) {
    setSides(height);
  }
  
  public void setWidth(double width) {
    setSides(width);
  }

  public void setArea(double area) {
    setSides(Math.sqrt(area));
  }
  
  public String toString() {
    return("Square (width/height=" + getWidth() + 
           ", area=" + getArea() + ")");
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}