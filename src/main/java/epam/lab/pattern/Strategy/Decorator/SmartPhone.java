package epam.lab.pattern.Strategy.Decorator;
import epam.lab.pattern.Strategy.Decorator.Strategy.UsingSmartphone;

public class SmartPhone  {
    UsingSmartphone usingSmartphone;

    public void setUsingSmartphone(UsingSmartphone usingSmartphone) {
        this.usingSmartphone = usingSmartphone;
    }
    public void execution(){
        usingSmartphone.usePhone();

    }

}
