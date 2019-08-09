package chainofresponsibility;

public class NoDiscountHandler extends Handler{

    @Override
    protected Order doHandle(Order o) {
        return o;
    }

    @Override
    protected boolean isForMe(Order o) {
        return true;
    }

}
