package strategy;

public class Greeter {

    GreetingStrategy strategy = new HelloGreetingStrategy();
    
    public void switchToNextStrategy() {
        strategy = strategy.getNextGreetingStrategy();
        
    }

    public String getGreeting() {
        return strategy.greet("world");
    }

}
