package homeWork7;

public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat("Barsik");
        cat.walk();
        Animal dog = new Dog("Tuzik");
        dog.greets();
        BigDog bigDog = new BigDog("Mastif");
        bigDog.greets();
        Animal lion = new Lion("Simba");
        System.out.println(lion.getName());
        WildAnimal wolf = new Wolf("Akela");
        wolf.hunting();
    }
}
