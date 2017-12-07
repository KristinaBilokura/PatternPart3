package epam.lab.pattern.Facade;

public class LifeCycleOfProduct {
    public static void main(String[] args) {
        MyFacade facade = new MyFacade();
        System.out.println("Prooduction :");
        System.out.println(facade.prod("Enterprice"));
        System.out.println("Advertisement :");
        System.out.println(facade.advert("Flyers"));
        System.out.println("Delivery :");
        System.out.println(facade.del("Express"));

    }

}
