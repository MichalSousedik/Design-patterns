package abstractfactorydemo;

public class EnglishProviderFactory implements ProviderFactory {

    @Override
    public GreetingProvider createGreetingProvider() {
        return new EnglishGreetingProvider();
    }

    @Override
    public NameProvider createNameProvider() {
        return new EnglishNameProvider();
    }

}
