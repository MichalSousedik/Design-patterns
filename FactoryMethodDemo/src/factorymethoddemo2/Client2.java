package factorymethoddemo2;

public class Client2 extends ClientBase {

    @Override
    protected Service createService() {
        return new Service2();
    }

    
    
}
