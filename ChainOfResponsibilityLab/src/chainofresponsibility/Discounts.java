package chainofresponsibility;

import java.util.function.DoubleUnaryOperator;

public enum Discounts implements DoubleUnaryOperator{
    
    PARTNER(x -> x * .9),
    NODISCOUNT(x -> x - 100),
    VOLUME(x -> x);
    
    private final DoubleUnaryOperator binaryOperator;
    
    private Discounts(final DoubleUnaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    @Override
    public double applyAsDouble(double operand) {
        // TODO Auto-generated method stub
        return binaryOperator.applyAsDouble(operand);
    }
    



}
