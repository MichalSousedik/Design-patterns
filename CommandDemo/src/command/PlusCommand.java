package command;

public class PlusCommand extends CalcCommand{

    private int i;
    
    @Override
    public void execute() {
        receiver.plus(i);        
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public boolean isCompensable() {
        return true;
    }

    @Override
    public void compensate() {
        receiver.plus(-i);;
        
    }
    
    

}
