package state;

public class ArchivedState implements DocumentState {

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
        return "archived";
    }

    @Override
    public DocumentState approve() {
        System.out.println("Document is archived, thus cannot be approved.");
        return this;
    }

    @Override
    public DocumentState archive() {
        System.out.println("Document has been already archived");
        return this;
    }
}
