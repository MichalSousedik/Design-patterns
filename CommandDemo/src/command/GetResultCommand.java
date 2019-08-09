package command;

public class GetResultCommand extends CalcCommand {

    private int result;

    @Override
    public void execute() {
        result = receiver.getResult();

    }


    public int getResult() {
        return result;
    }


    @Override
    public boolean isCompensable() {
        return false;
    }


    @Override
    public void compensate() {
        
    }

}
