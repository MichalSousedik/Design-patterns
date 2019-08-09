package chainofresponsibility;

public class VolumeDiscountHandler extends Handler{

    @Override
    protected Order doHandle(Order o) {
        o.setPrice(o.getPrice() - 100);
        return o;
    }

    @Override
    protected boolean isForMe(Order o) {
        return o.getPrice()>1000;
    }

}
