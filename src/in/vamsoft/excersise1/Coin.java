package in.vamsoft.excersise1;
public enum Coin {
  HEADS, TAILS;
  
  //dfsdgjisjgjklmdfkl
  
  public static Coin flip() {
    if (Math.random() < 0.5) {
      return(HEADS);
    } else {
      return(TAILS);
    }
  }
}
