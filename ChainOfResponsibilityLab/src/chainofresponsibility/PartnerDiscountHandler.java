package chainofresponsibility;

public class PartnerDiscountHandler extends Handler{

    @Override
    protected Order doHandle(Order o) {
        o.setPrice(Discounts.PARTNER.applyAsDouble(o.getPrice()));
        return o;
    }

    @Override
    protected boolean isForMe(Order o) {
        return ("Gopas").equals(o.getCustomer());
    }

}
