package decorator;

public abstract class TextDecorator implements Text{

    protected Text text;
    
    public TextDecorator(Text text) {
        this.text = text;
    }
    
    @Override
    public void setValue(String value) {
        text.setValue(value);        
    }

    @Override
    public String getValue() {
        return text.getValue();
    } 
    
    
    
}
