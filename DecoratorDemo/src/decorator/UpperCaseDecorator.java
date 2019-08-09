package decorator;

public class UpperCaseDecorator extends TextDecorator{

    public UpperCaseDecorator(Text text) {
        super(text);
    }
    
    @Override
    public void setValue(String value) {
        super.setValue(value.toUpperCase());
    }   
    
    
}
