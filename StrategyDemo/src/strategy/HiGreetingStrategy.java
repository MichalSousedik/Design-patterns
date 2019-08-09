package strategy;

public class HiGreetingStrategy implements GreetingStrategy {

    @Override
    public String greet(String string) {
        return "Hi " + string;
    }

    @Override
    public GreetingStrategy getNextGreetingStrategy() {
        return new HelloGreetingStrategy();
    }

}
