package proxydemo;

public class SmartCalcProxy implements Calculator {

    private Calculator calc;
    
    public SmartCalcProxy(Calculator calc) {
        this.calc = calc;
    }
    
    @Override
    public double plus(double x, double y) {
        return Math.round(calc.plus(x, y));
    }

}
