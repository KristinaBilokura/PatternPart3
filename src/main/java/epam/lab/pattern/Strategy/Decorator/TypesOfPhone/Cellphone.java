package epam.lab.pattern.Strategy.Decorator.TypesOfPhone;

import epam.lab.pattern.Strategy.Decorator.Strategy.UsingSmartphone;
import epam.lab.pattern.Strategy.Decorator.Tool;

public class Cellphone implements Tool {
    @Override
    public String doCall() {
        return "Do call";
    }


}
