package strategy;

public interface GreetingStrategy {

    String greet(String string);
    GreetingStrategy getNextGreetingStrategy();

}
