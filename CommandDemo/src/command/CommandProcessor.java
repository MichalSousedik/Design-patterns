package command;

import java.util.Stack;

public class CommandProcessor {
        
    private Stack<Command> history = new Stack<>();
    
    
    public void executeCommand(Command cmd) {
        cmd.execute();
        System.out.println(cmd);
        if(cmd.isCompensable()) history.add(cmd);
    }
    
    public void compansateCommand() {
        history.pop().compensate();
    }

}
