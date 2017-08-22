package in.vamsoft.excersise1;
/*
 * @author vignesh
 */
public class CarSale implements Sellable {
  private final String carName;
  private final double listPrice;
  private final double discount;

  public CarSale(String carName, double listPrice, double discount) {
    this.carName = carName;
    this.listPrice = listPrice;
    this.discount = discount;
  }

  public String getCarName() {
    return(carName);
  }

  public double getListPrice() {
    return(listPrice);
  }

  public double getDiscount() {
    return(discount);
  }

  public double getCost() {
    return(listPrice * (1.0 - discount/100));
  }

 public String toString() {
    return("CarSale: " + carName + " with list price of $" + listPrice 
           + " and discount of " + discount + "%.");
  }
}
