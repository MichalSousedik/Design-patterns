package proxydemo;

public class Client {

    private Calculator calc;
    
    public Client(Calculator calc) {
        this.calc = calc;
    }
    
    public void useCalc() {
        System.out.println(calc.plus(0.5, 0.8));
        System.out.println(calc.plus(0.8, 0.5));
        System.out.println(calc.plus(0.9, 0.8));
        System.out.println(calc.plus(0.5, 0.8));
        System.out.println(calc.plus(0.5, 0.8));
        System.out.println(calc.plus(0.5, 0.8));
    }

}
