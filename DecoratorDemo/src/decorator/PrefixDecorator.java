package decorator;

public class PrefixDecorator extends TextDecorator{

    public PrefixDecorator(Text text) {
        super(text);
    }
    
    public void addPrefix(String prefix) {
        setValue(prefix + text.getValue());
    }

    
    
    
}
