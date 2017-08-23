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
