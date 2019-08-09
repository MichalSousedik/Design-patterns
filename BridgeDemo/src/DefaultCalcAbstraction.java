
public class DefaultCalcAbstraction extends CalcAbstraction {

    public DefaultCalcAbstraction() {
        super(new DefaultCalcImplementation());
    }

}
