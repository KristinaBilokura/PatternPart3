package epam.lab.pattern.Strategy.Decorator;

import epam.lab.pattern.Strategy.Decorator.Strategy.DoCall;
import epam.lab.pattern.Strategy.Decorator.Strategy.MakingPhoto;
import epam.lab.pattern.Strategy.Decorator.Strategy.OpenMaps;
import epam.lab.pattern.Strategy.Decorator.Strategy.SurfingTheInternet;
import epam.lab.pattern.Strategy.Decorator.TypesOfPhone.Cellphone;
import epam.lab.pattern.Strategy.Decorator.TypesOfPhone.PhoneWithCamera1997;
import epam.lab.pattern.Strategy.Decorator.TypesOfPhone.PhoneWithGPS1999;
import epam.lab.pattern.Strategy.Decorator.TypesOfPhone.PhoneWithWifi1998;

public class SmartPhoneExecution {
    public static void main(String[] args) {
        Tool tool =new PhoneWithGPS1999(new PhoneWithWifi1998(new PhoneWithCamera1997(new Cellphone()) ));
        System.out.println(tool.doCall()+"\n");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setUsingSmartphone(new DoCall());
        smartPhone.execution();
        smartPhone.setUsingSmartphone(new MakingPhoto());
        smartPhone.execution();
        smartPhone.setUsingSmartphone(new SurfingTheInternet());
        smartPhone.execution();
        smartPhone.setUsingSmartphone(new OpenMaps());
        smartPhone.execution();


    }
}
