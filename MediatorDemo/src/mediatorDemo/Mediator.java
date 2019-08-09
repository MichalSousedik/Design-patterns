package mediatorDemo;

public class Mediator {

    private Calc calc;
    private Logger logger;

    public void setCalc(Calc calc) {
        this.calc = calc;
        
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public void log(String string) {
        logger.log(string);
        
    }

    public int plus(int count, int i, boolean log) {
        return calc.plus(count, i, log);
    }

}
