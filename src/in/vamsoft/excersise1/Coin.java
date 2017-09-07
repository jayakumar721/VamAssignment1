<<<<<<< HEAD
package in.vamsoft.excersise1;

public enum Coin {
  HEADS, TAILS;
  
  /**
   * creating Coin flip method. 
   * @return it returns heads or tails.
   */
  
  public static Coin flip() {
    if (Math.random() < 0.5) {
      return (HEADS);
    } else {
      return (TAILS);
    }
  }
}
=======
package in.vamsoft.excersise1;
/*
 * @author vignesh
 */
public enum Coin {
  HEADS, TAILS;
  
  public static Coin flip() {
    if (Math.random() < 0.5) {
      return(HEADS);
    } else {
      return(TAILS);
    }
  }
}
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
