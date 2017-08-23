package in.vamsoft.excersise1;
public interface Sellable {
  double getCost();
  
  public static Sellable cheapest(Sellable[] items) {
    Sellable cheapestItem = null;
    double lowestCost = Double.MAX_VALUE;
    for(Sellable item: items) {
      double cost = item.getCost();
      if (cost < lowestCost) {
        cheapestItem = item;
        lowestCost = cost;
      }
    }
    return(cheapestItem);
  }
  
  public static double totalCost(Sellable[] items) {
    double total = 0;
    for(Sellable item: items) {
      total = total + item.getCost();
    }
    return(total);
  }
}
