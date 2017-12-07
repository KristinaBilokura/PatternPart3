package epam.lab.pattern.Facade;

public class Advertisement {
    public String typeOfAdvertisement(String type){
        switch (type){
            case "Flyers": return "Flyers.";
            case "Media": return "Media.";
            case "BigBoards" : return "BigBoard";
            default: return "No such type of advertisement";
        }
    }

}
