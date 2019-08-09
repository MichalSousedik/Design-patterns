package chainofresponsibility;

public abstract class Handler {

   private Handler next;
    
   public Order handle(Order o) {
       if(isForMe(o)) {
           return doHandle(o);
       }
       else {
           return next.handle(o);
       }
   }

   protected abstract Order doHandle(Order o);

   protected abstract boolean isForMe(Order o);

    public Handler getNext() {
        return next;
    }
    
    public void setNext(Handler next) {
        this.next = next;
    }
   
   
    
}
