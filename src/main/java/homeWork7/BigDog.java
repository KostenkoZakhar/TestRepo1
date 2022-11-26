package homeWork7;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog dog) {
        System.out.println("Woooow");
    }
    public void greets(BigDog dog) {
        System.out.println("Woooooooow");
    }
}
