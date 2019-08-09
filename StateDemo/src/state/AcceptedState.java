package state;


public class AcceptedState implements DocumentState {

    @Override
    public boolean valid(Document document) {
        return document.getTitle().isPresent();
    }

    @Override
    public DocumentState nextState() {
        return new ArchivedState();
    }
    
    @Override
    public String toString() {
        return "accepted";
    }

    @Override
    public DocumentState approve() {
        System.out.println("You have already approved this document.");
        return new AcceptedState();
    }

    @Override
    public DocumentState archive() {
        return new ArchivedState();
    }
    
}
