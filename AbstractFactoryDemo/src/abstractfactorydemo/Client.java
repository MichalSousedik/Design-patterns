package abstractfactorydemo;

public abstract class Client {
    
    public abstract ProviderFactory createProviderFactory();

    public void userServices() {
        
        ProviderFactory factory = createProviderFactory();
        
        GreetingProvider greetingProvider = factory.createGreetingProvider();
        NameProvider nameProvider = factory.createNameProvider();
        
        String greeting = greetingProvider.getGreeting();
        String name = nameProvider.getName();
        
        System.out.println(greeting + ", " + name);
        
    }

}
