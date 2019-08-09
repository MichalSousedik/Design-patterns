package mediatorDemo;

public class Client1 {

    private Calc calc;

    public Client1(Calc calc) {
        this.calc = calc;
    }

    public Integer onePlusOne() {
        return calc.plus(1,1, true);
    }
    
    
    
    
    
    
}
