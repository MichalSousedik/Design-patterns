package iteratordemo;


public class IteratorDemo {

    public static void main(String[] args) {
        
        Client c = new Client();
        for(Client x : c) {
            System.out.println("Hello");            
        }

    }

}
