
public class BridgeLabDemo {

    public static void main(String[] args) {
        
        StringClient stringClient = new StringClient();
        TransformatorAbstraction stringTransformatorAbstraction = new UpperTransformatorAbstraction();
        stringClient.setStringTransformator(stringTransformatorAbstraction);
        stringClient.useTransformator();

        stringTransformatorAbstraction = new LowerTransformatorAbstraction();
        stringClient.setStringTransformator(stringTransformatorAbstraction);
        stringClient.useTransformator();

        stringTransformatorAbstraction = new UpperSeveralTransformatorAbstraction();
        stringClient.setStringTransformator(stringTransformatorAbstraction);
        stringClient.useTransformatorSeveral();
        
        
    }
    
}
