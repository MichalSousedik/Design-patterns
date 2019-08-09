package templateMethodDemo;

public class TemplateMethodDemo {
 
    public static void main (String[] args) {
        Greeter hello = new HelloGreeter();
        Greeter hi = new HiGreeter();
        
        hello.greet();
        hi.greet();
    }
    
}
