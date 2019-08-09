package chainofresponsibility;

public class VolumeDiscountHandler extends Handler{

    @Override
    protected Order doHandle(Order o) {
        o.setPrice(Discounts.VOLUME.applyAsDouble(o.getPrice()));
        return o;
    }

    @Override
    protected boolean isForMe(Order o) {
        return o.getPrice()>1000;
    }

}
