package in.vamsoft.excersise1.shape1;
public class CircleTest {
  public static void main(String[] args) {
    for(int i=0; i<10; i++) {
      Circle c = new Circle(10*Math.random());
      System.out.println(c);
    }
  }
}