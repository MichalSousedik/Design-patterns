package templateMethodDemo;

public class HiGreeter extends Greeter {

    @Override
    protected String getFirstPart() {
        return "Hi";
    }

}
