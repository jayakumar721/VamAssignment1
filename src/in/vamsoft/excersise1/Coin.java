package in.vamsoft.excersise1;
public enum Coin {
  HEADS, TAILS;
  
  /** Returns Coin.HEADS and Coin.TAILS with equal probability. */
  
  public static Coin flip() {
    if (Math.random() < 0.5) {
      return(HEADS);
    } else {
      return(TAILS);
    }
  }
}
