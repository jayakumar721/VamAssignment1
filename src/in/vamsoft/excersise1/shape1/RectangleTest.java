package in.vamsoft.excersise1.shape1;
public class RectangleTest {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      Rectangle r = 
        new Rectangle(10*Math.random(), 20*Math.random());
      System.out.println(r);
    }
  }
}