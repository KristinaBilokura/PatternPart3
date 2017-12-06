package epam.lab.pattern.Strategy.Decorator.Strategy;

public class MakingPhoto implements UsingSmartphone {
    @Override
    public void usePhone() {
        System.out.println("Shoot.");
    }
}
