package epam.lab.pattern.Strategy.Decorator.TypesOfPhone;

import epam.lab.pattern.Strategy.Decorator.MyDecorator;
import epam.lab.pattern.Strategy.Decorator.Strategy.UsingSmartphone;
import epam.lab.pattern.Strategy.Decorator.Tool;

public class PhoneWithCamera1997 extends MyDecorator  {
    public PhoneWithCamera1997(Tool tool) {
        super(tool);
    }
    public String madePhoto(){
         return "\nNew option: Say cheese!";
    }


    @Override
    public String doCall() {
        return super.doCall()+madePhoto();
    }


}
