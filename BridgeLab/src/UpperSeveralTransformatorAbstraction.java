
public class UpperSeveralTransformatorAbstraction extends TransformatorAbstraction {

    public UpperSeveralTransformatorAbstraction() {
        super(new UpperSeveralTransformator());
    }
    
    public String[] modify(String...strings) {
        return ((UpperSeveralTransformator) transformator).modify(strings);
    }

}
