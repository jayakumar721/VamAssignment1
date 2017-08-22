package in.vamsoft.excersise3;
/*
 * @author vignesh
 */
import java.net.*;
import java.io.*;


public class ShapeServer {
  public ShapeServer(int port, int numShapes) {
    listen(port, numShapes);
  }

  @SuppressWarnings("resource")
  public void listen(int port, int numShapes) {
    try(ServerSocket listener = new ServerSocket(port);) {
      Socket server;
      while(true) {
        server = listener.accept();
        Shape[] shapes = StoreShapes.getRandomShapes(numShapes);
        System.out.println("Sending array with sum of areas: " +
                            ShapeUtils.sumAreas(shapes));
        ObjectOutputStream out =
          new ObjectOutputStream(server.getOutputStream());
        out.writeObject(shapes);
        out.close();
      }
    } catch (IOException ioe) {
      System.out.println("IOException: " + ioe);
      ioe.printStackTrace();
    }
  }

  public static void main(String[] args) {
    int port = 8888;
    int numShapes = 25;
    if (args.length > 1) {
      try {
        port = Integer.parseInt(args[0]);
        numShapes = Integer.parseInt(args[1]);
      } catch(NumberFormatException nfe) {}
    }
    new ShapeServer(port, numShapes);
  }
}