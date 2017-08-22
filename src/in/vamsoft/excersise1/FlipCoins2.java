package in.vamsoft.excersise1;
import javax.swing.*;
/*
 * @author vignesh
 */
public class FlipCoins2 {
  
	public static void main(String[] args) {
    
		String numString =JOptionPane.showInputDialog("Number of coin flips:");
    int num = Integer.parseInt(numString);  
    String coin;
    for(int i=0; i<num; i++) {
      if (Math.random() < 0.5) {
        coin = "Heads";
      } else {
        coin = "Tails";
      }
      System.out.println(coin);
    }
  }
}