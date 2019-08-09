package state;

public class DraftState implements DocumentState {

    @Override
    public boolean valid(Document document) {
        return true;
    }

    @Override
    public DocumentState nextState() {
        return new AcceptedState();
    }
    
    @Override
    public String toString() {
        return "draft";
    }

    @Override
    public DocumentState approve() {
        return new AcceptedState();
    }

    @Override
    public DocumentState archive() {
        System.out.println("Document cannot be archive in the draft state");
        return this;
    }

}
