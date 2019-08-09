package abstractfactorydemo;

public class CzechGreetingProvider implements GreetingProvider {

    @Override
    public String getGreeting() {
        return "Ahoj";
    }

}
