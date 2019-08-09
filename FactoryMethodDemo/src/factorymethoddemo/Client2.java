package factorymethoddemo;

public class Client2 extends Client {

    @Override
    protected Service createService() {
        return new Service2();
    }

    
    
}
