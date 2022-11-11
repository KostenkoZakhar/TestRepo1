package homeWork5;

import java.util.Objects;

public class Cat extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!Objects.equals(color, "green")) {
            this.color = color;
        } else {System.out.println("Ошибка! Кот не может быть зеленым!");
        }
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "white";
    }

}
