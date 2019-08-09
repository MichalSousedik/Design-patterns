package strategy;

public class HelloGreetingStrategy implements GreetingStrategy {

    @Override
    public String greet(String string) {
        return "Hello " + string;
    }

    @Override
    public GreetingStrategy getNextGreetingStrategy() {
        return new HiGreetingStrategy();
    }

}
