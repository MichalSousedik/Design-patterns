package command;

public class CommandFactory {

    private Calculator receiver;
    
    public CommandFactory(Calculator receiver) {
        this.receiver = receiver;
    }

    public Command createPlusCommand(int x) {
        PlusCommand cmd = new PlusCommand();
        cmd.setI(x);
        cmd.setReceiver(receiver);
        return cmd;
    }

    public Command createResultCommand() {
        GetResultCommand cmd = new GetResultCommand();
        cmd.setReceiver(receiver);
        return cmd;
    }
}
