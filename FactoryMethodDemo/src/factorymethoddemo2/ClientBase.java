package factorymethoddemo2;

public abstract class ClientBase {
 
    protected abstract Service createService();
    
    public void useService() {
        Service service = createService();
        String greeting = service.getGreeting();
        System.out.println(greeting);
    }
    
    public void useServiceUpper() {
        Service service = createService();
        String greeting = service.getGreeting().toUpperCase();
        System.out.println(greeting);
    }
    
}
