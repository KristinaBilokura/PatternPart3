package epam.lab.pattern.Strategy.Decorator.TypesOfPhone;

import epam.lab.pattern.Strategy.Decorator.Strategy.UsingSmartphone;
import epam.lab.pattern.Strategy.Decorator.Tool;

public class Cellphone implements Tool,UsingSmartphone {
    @Override
    public String doCall() {
        return "Do call";
    }

    @Override
    public void usePhone() {
        System.out.println("Please wait the call set up!");
    }
}
