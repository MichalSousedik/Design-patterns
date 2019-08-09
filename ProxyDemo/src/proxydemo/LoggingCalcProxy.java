package proxydemo;


public class LoggingCalcProxy implements Calculator {

    private Calculator calc;
    
    public LoggingCalcProxy(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public double plus(double x, double y) {
        System.out.println("Client wants to add two double numbers " + x + " and " + y);
        return calc.plus(x, y);     
    }

}
