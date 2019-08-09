package command;

public abstract class CalcCommand implements Command {

    protected Calculator receiver;

    public void setReceiver(Calculator calc) {
        this.receiver = calc;
        
    }
    
}
