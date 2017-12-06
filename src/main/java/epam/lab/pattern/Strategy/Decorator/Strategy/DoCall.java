package epam.lab.pattern.Strategy.Decorator.Strategy;

import epam.lab.pattern.Strategy.Decorator.MyDecorator;
import epam.lab.pattern.Strategy.Decorator.Tool;

public class DoCall implements UsingSmartphone{

    @Override
    public void usePhone() {
        System.out.println("Please wait the call set up!");
    }
}
