package in.vamsoft.excersise3;
/*
 * @author vignesh
 */
import java.net.*;
import java.io.*;


public class ShapeClient {
  public ShapeClient(String host, int port) {
    try(Socket client = new Socket(host, port);
        ObjectInputStream in = new ObjectInputStream(client.getInputStream())) {
      Shape[] shapes = (Shape[])in.readObject();
      System.out.println("Received array with sum of areas: " +
                         ShapeUtils.sumAreas(shapes));
    } catch(IOException ioe) {
      System.out.println("Error reading socket: " + ioe);
    } catch(ClassNotFoundException cnfe) {
      System.out.println("No such class: " + cnfe);
    }
  }

  public static void main(String[] args) {
    String host = "localhost";
    int port = 8888;
    if (args.length > 1) {
      try {
        host = args[0];
        port = Integer.parseInt(args[1]);
      } catch(NumberFormatException nfe) {}
    }
    new ShapeClient(host, port);
  }
}