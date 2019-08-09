package factorymethoddemo;

public class Client {
    
    protected Service createService() {
        return new Service();
    }

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
