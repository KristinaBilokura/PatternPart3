package epam.lab.pattern.Facade;

public class Production {
    public String typeProduction(String typeProduction){
        switch (typeProduction){
            case "Homemade": return "Homemade. 100$";
            case "Enterprice": return "Enterprice. 10$";
            default: return "No such type of production";
        }
    }
}
