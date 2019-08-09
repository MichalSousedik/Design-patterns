package abstractfactorydemo;

public class EnglishGreetingProvider implements GreetingProvider {

    @Override
    public String getGreeting() {
        return "Hello";
    }

}
