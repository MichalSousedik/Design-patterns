package strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        
        Greeter greeter = new Greeter();
        System.out.println(greeter.getGreeting());
        
        greeter.switchToNextStrategy();
        System.out.println(greeter.getGreeting());
        
        greeter.switchToNextStrategy();
        System.out.println(greeter.getGreeting());
        
        greeter.switchToNextStrategy();
        System.out.println(greeter.getGreeting());
        
        greeter.switchToNextStrategy();
        System.out.println(greeter.getGreeting());
        
        greeter.switchToNextStrategy();
        System.out.println(greeter.getGreeting());
        
        greeter.switchToNextStrategy();
        System.out.println(greeter.getGreeting());

    }

}
