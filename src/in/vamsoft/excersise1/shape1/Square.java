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
}