package in.vamsoft.excersise3;
/*
 * @author vignesh
 */
public class Square extends Rectangle {
  public Square(double width) {
    super(width, width);
  }

  @Override
  public double getHeight() {
    return(getWidth());
  }

  @Override
  public void setHeight(double height) {
    setWidth(height);
  }

  @Override
  public double getArea() {
    return(getWidth() * getWidth());
  }

  public void setArea(double area) {
    setWidth(Math.sqrt(area));
  }
}