package epam.lab.pattern.Strategy.Decorator.Strategy;

public class SurfingTheInternet implements UsingSmartphone {
    @Override
    public void usePhone() {
        System.out.println("Checking email");
    }
}
