package proxydemo;

public class Calc implements Calculator {

    
    @Override
    public double plus(double x, double y) {
        return x + y;
    }
}
