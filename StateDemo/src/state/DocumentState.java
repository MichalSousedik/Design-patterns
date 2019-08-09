package state;

public interface DocumentState {
    
    boolean valid(Document document);
    DocumentState nextState();
    DocumentState approve();
    DocumentState archive();
    
}
