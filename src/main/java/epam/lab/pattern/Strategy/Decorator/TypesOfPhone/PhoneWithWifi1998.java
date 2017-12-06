package epam.lab.pattern.Strategy.Decorator.TypesOfPhone;

import epam.lab.pattern.Strategy.Decorator.MyDecorator;
import epam.lab.pattern.Strategy.Decorator.Strategy.UsingSmartphone;
import epam.lab.pattern.Strategy.Decorator.Tool;

public class PhoneWithWifi1998 extends MyDecorator  {
    public PhoneWithWifi1998(Tool tool) {
        super(tool);
    }
    public String setConnection(){
        return "\nNew option: Wifi is connected successfully!";
    }

    @Override
    public String doCall() {
        return super.doCall()+setConnection();
    }


}
