package abstractfactorydemo;

public class EnglishClient extends Client {

    @Override
    public ProviderFactory createProviderFactory() {
        return new EnglishProviderFactory();
    }

}
