package in.vamsoft.excersise3;
/*
 * @author vignesh
 */
import java.io.*;


public abstract class Shape implements Serializable {
  public abstract double getArea();
  
  public void printInfo() {
    System.out.println(getClass().getSimpleName() + 
                       " has area " + getArea());
  }
}