package epam.lab.pattern.Strategy.Decorator.Strategy;

public class OpenMaps implements UsingSmartphone {
    @Override
    public void usePhone() {
        System.out.println("Opening GOOGLE maps");
    }
}
