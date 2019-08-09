package chainofresponsibility;

public class PartnerDiscountHandler extends Handler{

    @Override
    protected Order doHandle(Order o) {
        o.setPrice(o.getPrice() * .9);
        return o;
    }

    @Override
    protected boolean isForMe(Order o) {
        return ("Gopas").equals(o.getCustomer());
    }

}
