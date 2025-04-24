import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ingredient {
  double weight;
  String name;
  double costPerUnit;

  public Ingredient() {

  }

  public Ingredient(String name, double weight) {
    this.weight = weight;
    this.name = name;
  }

  public void setCostPerUnit(double costPerUnit) {
    this.costPerUnit = costPerUnit;
  }

  public double getCostPerUnit() {
    return this.costPerUnit;
  }

  public double cost() {
    return BigDecimal.valueOf(this.weight)
        .multiply(BigDecimal.valueOf(this.costPerUnit))
        .setScale(2, RoundingMode.HALF_UP)
        .doubleValue();
  }

  public static void main(String[] args) {
    Ingredient[] ingredients = new Ingredient[3];
    ingredients[0] = new Ingredient("apple", 3);
    ingredients[1] = new Ingredient("pork", 0.5);
    ingredients[2] = new Ingredient("rice", 0.8);

    ingredients[0].setCostPerUnit(8.8);
    ingredients[1].setCostPerUnit(88);
    ingredients[2].setCostPerUnit(70);

    for (int i = 0; i < ingredients.length; i++) {
      System.out.println(ingredients[i].name + " " + ingredients[i].cost());
    }
  }
}
