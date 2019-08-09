package decorator;

public class DecoratorDemo {

    public static void main(String[] args) {
        
        Text text = new UpperCaseDecorator(new TextImpl());
        text.setValue("world");
        System.out.println(text.getValue());
        
        PrefixDecorator prefixDecorator = new PrefixDecorator(text);
        prefixDecorator.addPrefix("hello ");
        System.out.println(text.getValue());
        
        

    }

}
