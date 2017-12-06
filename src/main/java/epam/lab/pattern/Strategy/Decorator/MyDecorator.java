package epam.lab.pattern.Strategy.Decorator;


public abstract class MyDecorator implements Tool {
    Tool tool;
    public MyDecorator(Tool tool){
        this.tool =tool;
    }

    @Override
    public String doCall() {
        return tool.doCall();
    }

}
