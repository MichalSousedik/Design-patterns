package templateMethodDemo;

public class HelloGreeter extends Greeter {

    @Override
    protected String getFirstPart() {
        return "Hello";
    }

}
