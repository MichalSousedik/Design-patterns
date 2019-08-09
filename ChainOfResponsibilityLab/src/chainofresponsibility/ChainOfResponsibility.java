package chainofresponsibility;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        Handler partnerDiscount = new PartnerDiscountHandler();
        Handler volumeDiscount = new VolumeDiscountHandler();
        Handler noDiscount = new NoDiscountHandler();
        
        Handler head = partnerDiscount;
        head.setNext(volumeDiscount);
        head.getNext().ifPresent(next -> next.setNext(noDiscount));
        

        Order partnerOrder = new Order("Gopas", 8000);
        Order volumeOrder = new Order("Gopas", 10000);
        Order noDiscountOrder = new Order("No discount", 100);
        
        head.handle(partnerOrder);
        System.out.println(partnerOrder);
        
        head.handle(volumeOrder);
        System.out.println(volumeOrder);
        
        head.handle(noDiscountOrder);
        System.out.println(noDiscountOrder);
        
        
    }
    
}
