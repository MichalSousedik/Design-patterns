package command;

public class CommandDemo {

    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        CommandProcessor invoker = new CommandProcessor();
        
        CommandFactory factory = new CommandFactory(calc);
        invoker.executeCommand(factory.createPlusCommand(2));
        invoker.executeCommand(factory.createPlusCommand(3));
        GetResultCommand getResultCmd = (GetResultCommand) factory.createResultCommand();
        invoker.executeCommand(getResultCmd);
        System.out.println(getResultCmd.getResult());
        invoker.compansateCommand();
        invoker.executeCommand(getResultCmd);
        System.out.println(getResultCmd.getResult());
        
    }

}
