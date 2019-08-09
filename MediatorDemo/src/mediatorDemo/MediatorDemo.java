package mediatorDemo;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Calc calc = new Calc(mediator);
        Logger logger = new Logger(mediator);
        Client1 cl1 = new Client1(calc);
        Client2 cl2 = new Client2(calc);
        
        
        System.out.println(cl1.onePlusOne());
        System.out.println(cl2.twoPlusTwo());

    }

}
