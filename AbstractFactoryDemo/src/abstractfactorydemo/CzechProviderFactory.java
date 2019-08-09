package abstractfactorydemo;

public class CzechProviderFactory implements ProviderFactory {

    @Override
    public GreetingProvider createGreetingProvider() {
        return new CzechGreetingProvider();
    }

    @Override
    public NameProvider createNameProvider() {
        return new CzechNameProvider();
    }

}
