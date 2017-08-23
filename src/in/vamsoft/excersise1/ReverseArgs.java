package in.vamsoft.excersise1;

public class ReverseArgs {
 /**
  * The Main Method to reverse random number.
  * @param args LOGIN - login of user PASSWORD - password
  */
  public static void main(String[] args) {
    for (int i = args.length; i > 0; i--) {
      System.out.println(args[i - 1].toUpperCase());
    }
  }
}