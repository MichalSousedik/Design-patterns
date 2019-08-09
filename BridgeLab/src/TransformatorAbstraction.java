
public abstract class TransformatorAbstraction {
    
    protected Transformator transformator;

    public TransformatorAbstraction(Transformator transformator) {
        this.transformator = transformator;
    }

    public String modify(String string) {
        return transformator.modify(string);
    }
    
    
    

}
