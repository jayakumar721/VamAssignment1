<<<<<<< HEAD
package in.vamsoft.excersise1.shape;


public class Square {
  public double width;

  public Square(double width) {
    this.width = width;
  }

  public double getArea() {
    return (width * width);
  }

  public void setArea(double area) {
    width = Math.sqrt(area);
  }
=======
package in.vamsoft.excersise1.shape;
/*
 * @author vignesh
 */
public class Square {
  public double width;

  public Square(double width) {
    this.width = width;
  }

  public double getArea() {
    return(width * width);
  }

  public void setArea(double area) {
    width = Math.sqrt(area);
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}