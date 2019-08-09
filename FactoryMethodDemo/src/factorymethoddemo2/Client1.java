package factorymethoddemo2;

public class Client1 extends ClientBase{
    
    @Override
    protected Service createService() {
        return new Service1();
    }

}
