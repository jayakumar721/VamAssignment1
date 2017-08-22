package in.vamsoft.excersise3;
/*
 * @author vignesh
 */
import java.io.*;

public class ReadShapes {
  public static Shape[] readShapesFromFile(String filename) {
    try(FileInputStream fileIn = new FileInputStream(new File(filename));
        ObjectInputStream in = new ObjectInputStream(fileIn)) {
      Shape[] shapes = (Shape[])in.readObject();
      return(shapes);
    } catch(IOException ioe) {
      System.out.println("Error reading file: " + ioe);
    } catch(ClassNotFoundException cnfe) {
      System.out.println("No such class: " + cnfe);
    }
    return(null);
  }

  public static void main(String[] args) {
    String filename = "Shapes.ser";
    if (args.length > 0) {
      filename = args[0];
    }
    Shape[] shapes = readShapesFromFile(filename);
    System.out.println("Read array with sum of areas: " +
                       ShapeUtils.sumAreas(shapes));
  }
}