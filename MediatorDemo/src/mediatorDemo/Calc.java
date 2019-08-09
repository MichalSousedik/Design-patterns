package mediatorDemo;

public class Calc extends Colleague{

    public Calc(Mediator mediator) {
        super(mediator);
        mediator.setCalc(this);
    }

    public int plus(int i, int j, boolean log) {
        if(log) mediator.log("plus: " + i + ", " + j);
        return i + j;  
    }

}
