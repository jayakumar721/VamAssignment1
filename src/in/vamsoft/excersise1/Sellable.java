package in.vamsoft.excersise1;

/**
 * sellabe as interface.
 * @author JK
 *
 */
public interface Sellable {
  double getCost();
  
  /**
   * sellable cheapest method.
   * @param items getting as parameter
   * @return returning values
   */
  public static Sellable cheapest(Sellable[] items) {
    Sellable cheapestItem = null;
    double lowestCost = Double.MAX_VALUE;
    for (Sellable item: items) {
      double cost = item.getCost();
      if (cost < lowestCost) {
        cheapestItem = item;
        lowestCost = cost;
      }
    }
    return (cheapestItem);
  }
  
  /**
   * totalCost method.
   * @param items parameter
   * @return returning values
   */
  public static double totalCost(Sellable[] items) {
    double total = 0;
    for (Sellable item: items) {
      total = total + item.getCost();
    }
    return (total);
  }
}
