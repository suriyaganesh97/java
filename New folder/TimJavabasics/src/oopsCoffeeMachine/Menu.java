package oopsCoffeeMachine;

public class Menu {
    private String nameOfDrink;
    private int water;
    private int milk;
    private int coffee;
    private double cost;
    public Menu(String nameOfDrink, int water, int milk, int coffee, double cost) {
        this.nameOfDrink = nameOfDrink;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.cost = cost;
    }
    public String getNameOfDrink() {
        return nameOfDrink;
    }
    public void setNameOfDrink(String nameOfDrink) {
        this.nameOfDrink = nameOfDrink;
    }
    public int getWater() {
        return water;
    }
    public void setWater(int water) {
        this.water = water;
    }
    public int getMilk() {
        return milk;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public int getCoffee() {
        return coffee;
    }
    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    


}
