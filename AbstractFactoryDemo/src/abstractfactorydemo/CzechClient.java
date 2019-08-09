package abstractfactorydemo;

public class CzechClient extends Client {

    @Override
    public ProviderFactory createProviderFactory() {
        return new CzechProviderFactory();
    }

}

