package epam.lab.pattern.Strategy.Decorator.TypesOfPhone;

import epam.lab.pattern.Strategy.Decorator.MyDecorator;
import epam.lab.pattern.Strategy.Decorator.Strategy.UsingSmartphone;
import epam.lab.pattern.Strategy.Decorator.Tool;

public class PhoneWithGPS1999 extends MyDecorator {
    public PhoneWithGPS1999(Tool tool) {
        super(tool);
    }
    public String showWay(){
        return "\nNew option: Go ahead 200 metres!";
    }

    @Override
    public String doCall() {
        return super.doCall()+showWay();
    }

}
