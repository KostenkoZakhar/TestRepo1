package homeWork5;

public class MainLesson5 {
    public static void main(String[] args) {

        // Вывод на экран свойств объекта из конструктора с параметрами от Animal и Cat
        Cat cat1 = new Cat(true, "mice", 4, "black");
        System.out.println("Cat color is " + cat1.getColor() + " Other properties --> " + cat1.getEats() + " " + cat1.getNoOfLegs() + " " + cat1.getVegetarian());
        // Вывод на экран color c установленным валидным значением
        cat1.setColor("grey");
        System.out.println("Cat color is " + cat1.getColor());
        // Вывод на экран color c установленным невалидным значением
        cat1.setColor("green");
        System.out.println("Cat color is " + cat1.getColor());
    }
}
