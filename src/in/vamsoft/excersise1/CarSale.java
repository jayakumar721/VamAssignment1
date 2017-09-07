<<<<<<< HEAD
package in.vamsoft.excersise1;

import java.io.Serializable;

/**
 * Creating CarSale class that implements serializable.
 * @author JK
 * 
 */
public class CarSale implements Serializable {
  private final String carName;
  private final double listPrice;
  private final double discount;

  /**
   * Creating CarSacle as constructor with carName, listPrice and discount as parameters.
   * @param carName getting car name as parameter
   * @param listPrice getting price list as parameter
   * @param discount getting discount amount as parameter
   */
  public CarSale(String carName, double listPrice, double discount) {
    this.carName = carName;
    this.listPrice = listPrice;
    this.discount = discount;
  }

  public String getCarName() {
    return (carName);
  }

  public double getListPrice() {
    return (listPrice);
  }

  /**
   * creating getDiscount method.
   * @return to return the discount amount
   */
  public double getDiscount() {
    return (discount);
  }
 
  public double getCost() {
    return (listPrice * (1.0 - discount / 100));
  }

  @Override
  public String toString() {
    return ("CarSale: " + carName + " with list price of $" + listPrice 
           + " and discount of " + discount + "%.");
  }
}
=======
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
>>>>>>> 35b1b732e68ed3b6596b2e23d9ec90c62220f54e
