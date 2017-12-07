package epam.lab.pattern.Facade;

public class MyFacade {
    private  Advertisement advertisement;
    private Delivery delivery;
    private Production production;
    public MyFacade() {
        advertisement = new Advertisement();
        delivery = new Delivery();
        production = new Production();
    }
    public String advert(String typeAdvert ){
        return advertisement.typeOfAdvertisement(typeAdvert);
    }
    public String del(String typeD ){
        return delivery.typeDelivery(typeD);
    }
    public String prod(String typeP ){
        return production.typeProduction(typeP);
    }

}
