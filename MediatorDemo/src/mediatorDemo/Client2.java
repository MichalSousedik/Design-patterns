package mediatorDemo;

public class Client2 {
    
    private Calc calc;

    public Client2(Calc calc) {
        this.calc = calc;
    }

    public Integer twoPlusTwo() {
        return calc.plus(2,2, true);
    }
}
