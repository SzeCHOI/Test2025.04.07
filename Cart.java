import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Cart {
  private String[] items;
  private double qty;
  private double discount;
  private double price;

  // Item.java -> price, quantity

  public void setItems(String[] items) {
    this.items = items;
  }

  public String[] getItems() {
    return this.items;
  }

  public void setQty(double qty) {
    this.qty = qty;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public double getQty() {
    return this.qty;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public double getDiscount() {
    return this.discount;
  }

  public double checkoutAmout() {
    return BigDecimal.valueOf(this.qty)
        .multiply(BigDecimal.valueOf(this.qty))
        .multiply(BigDecimal.valueOf(this.price))
        .setScale(1, RoundingMode.HALF_UP)
        .doubleValue();
  }

  // checkoutAmout()
  public static void main(String[] args) {
    Cart a1 = new Cart();
    String[] items = new String[] {"Cake", "Cookie", "Bread", "Jam", "Coke"};
    
    a1.setItems(items);
    a1.setQty(1);
    a1.setPrice(10);



    System.out.println(a1.checkoutAmout());
    System.out.println(a1.getItems()[2]);



  }
}
