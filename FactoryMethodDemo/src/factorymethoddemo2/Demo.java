package factorymethoddemo2;

public class Demo {

    public static void main(String[] args) {
        ClientBase client = new Client1();
        client.useService();
        client.useServiceUpper();
    }

}
