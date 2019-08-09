package facadedemo;

public class CalcFacade {

    private Calc calc;
    private Logger logger;
       
    public CalcFacade(Calc calc, Logger logger) {
        this.calc = calc;
        this.logger = logger;
    }

    public int processPlus(int x, int y) {
        int result = calc.plus(x, y);
        logger.log(x + " + " + y + " = " + result);
        return result;
    }

    public void log(String string) {
        logger.log(string);        
    }
    
}
