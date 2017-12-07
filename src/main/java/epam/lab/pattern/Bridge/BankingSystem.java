package epam.lab.pattern.Bridge;

public abstract class BankingSystem {
    protected TechSupport techSupport;
    protected BankingSystem(TechSupport techSupport){
        this.techSupport= techSupport;
    }
    public abstract void support();
}
