package templateMethodDemo;

public abstract class Greeter {

    protected abstract String getFirstPart();
    public void greet() {
        System.out.println("Say: " + getFirstPart());
    }
    
}
