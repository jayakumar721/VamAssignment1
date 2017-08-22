package in.vamsoft.excersise3;
/*
 * @author vignesh
 */

public class ShapeUtils {
  public static double sumAreas(Shape[] shapes) {
    double sum = 0;
    for(Shape s: shapes) {
      sum = sum + s.getArea();
    }
    return(sum);
  }
  
  private ShapeUtils() {}
}
