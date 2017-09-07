<<<<<<< HEAD
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
=======
package in.vamsoft.excersise1;
/*
 * @author vignesh
 */
public class ReverseArgs {
  public static void main(String[] args) {
    for(int i=args.length; i>0; i--) {
      System.out.println(args[i-1].toUpperCase());
    }
  }
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
}