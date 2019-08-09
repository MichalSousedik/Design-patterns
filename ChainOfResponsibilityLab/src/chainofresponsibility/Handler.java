package chainofresponsibility;

import java.util.Optional;

public abstract class Handler {

   private Optional<Handler> next = Optional.empty();
    
   public Order handle(Order o) {
       if(isForMe(o)) {
           doHandle(o);
       }
       return next.map(next-> next.handle(o)).orElse(o);
   }

   protected abstract Order doHandle(Order o);

   protected abstract boolean isForMe(Order o);

    public Optional<Handler> getNext() {
        return next;
    }
    
    public void setNext(Handler next) {
        this.next = Optional.of(next);
    }
   
   
    
}
