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
}