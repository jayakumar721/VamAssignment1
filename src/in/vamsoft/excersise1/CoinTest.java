package in.vamsoft.excersise1;

/**
 * creating CoinTest as class.
 * @author JK
 *
 */
public class CoinTest {
 /**
  * Creating a main method to flip a coin.
  * @param args LOGIN - login of user PASSWORD - password
  */
 public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(Coin.flip());
    }
  }
}
