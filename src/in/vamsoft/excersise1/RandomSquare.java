package in.vamsoft.excersise1;

public class RandomSquare {
 /**
  * The main method to find square root.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    double[] nums = new double[100];
    for (int i = 0; i < nums.length; i++) {
      nums[i] = Math.random();
    }
    double sum = 0;
    for (double num: nums) {
      sum = sum + Math.sqrt(num);
    }
    System.out.println("Sum of square roots: " + sum);
  }
}