package in.vamsoft.excersise1;
public class FourNumbers {
  public static void main(String[] args) {
    double[] nums = { Math.random(), Math.random(),
                      Math.random(), Math.random() };
    for(double num: nums) {
      System.out.println(num);
    }
  }
}