package mediatorDemo;

public class Logger extends Colleague{

    private int count;
    
    public Logger(Mediator mediator) {
        super(mediator);
        mediator.setLogger(this);
    }

    public void log(String message) {
        count = mediator.plus(count, 1, false);
        System.out.println("log: " + message + " count: " + count);
    }
    
}
