package in.vamsoft.excersise1;

public class FourNumbers {

 /**
  * creating main method.
  * @param args LOGIN - login of user PASSWORD - password
  */
 public static void main(String[] args) {
    double[] nums = { Math.random(), Math.random(),
                      Math.random(), Math.random() };
    for (double num: nums) {
      System.out.println(num);
    }
  }
}