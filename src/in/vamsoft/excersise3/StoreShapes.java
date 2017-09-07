package in.vamsoft.excersise3;
/*
 * @author vignesh
 */
import java.io.*;


public class StoreShapes {
  public static void sendShapesToFile(Shape[] shapes, String filename) {
    try(FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
      out.writeObject(shapes);
    } catch(IOException ioe) {
      System.out.println("Error writing file: " + ioe);
    }
  }

  public static Shape getRandomShape() {
    double d = Math.random();
    if (d < 0.33) {
      return(new Circle(d*10));
    } else if (d < 0.66) {
      return(new Rectangle(d*20, d*10));
    } else {
      return(new Square(d*10));
    }
  }

  public static Shape[] getRandomShapes(int numShapes) {
    Shape[] shapes = new Shape[numShapes];
    for(int i=0; i<shapes.length; i++) {
      shapes[i] = getRandomShape();
    }
    return(shapes);
  }

  public static void main(String[] args) {
    String filename = "Shapes.ser";
    int numShapes = 30;
    if (args.length > 1) {
      filename = args[0];
      try {
        numShapes = Integer.parseInt(args[1]);
      } catch(NumberFormatException nfe) {}
    }
    Shape[] shapes = getRandomShapes(numShapes);
    System.out.println("Storing array with sum of areas: " +
                       ShapeUtils.sumAreas(shapes));
    sendShapesToFile(shapes, filename);
  }
}