package command;

public interface Command {

    void execute();
    boolean isCompensable();
    void compensate();    
    
}
