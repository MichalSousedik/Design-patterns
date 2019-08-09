import java.util.Arrays;

public class StringClient {

    private TransformatorAbstraction stringTransformatorAbstraction;
    
    public void setStringTransformator(TransformatorAbstraction stringTransformatorAbstraction) {
        this.stringTransformatorAbstraction = stringTransformatorAbstraction;      
    }

    public void useTransformator() {
        System.out.println(stringTransformatorAbstraction.modify("Hello"));        
    }

    public void useTransformatorSeveral() {
        String[] strings = ((UpperSeveralTransformatorAbstraction)stringTransformatorAbstraction).modify("Hello", "Bye", "Mate");
        Arrays.asList(strings).stream().forEach(s -> System.out.println(s)); 
    }

}
