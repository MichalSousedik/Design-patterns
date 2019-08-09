package abstractfactorydemo;

public interface ProviderFactory {

    GreetingProvider createGreetingProvider();

    NameProvider createNameProvider();


}
