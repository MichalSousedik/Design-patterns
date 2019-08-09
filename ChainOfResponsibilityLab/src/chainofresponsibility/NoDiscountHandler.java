package chainofresponsibility;

public class NoDiscountHandler extends Handler{

    @Override
    protected Order doHandle(Order o) {
        o.setPrice(Discounts.NODISCOUNT.applyAsDouble(o.getPrice()));
        return o;
    }

    @Override
    protected boolean isForMe(Order o) {
        return true;
    }

}
