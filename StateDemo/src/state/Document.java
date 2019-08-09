package state;

import java.util.Optional;

public class Document {

    private Optional<String> title = Optional.empty();
    
    private DocumentState state = new DraftState();

    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = Optional.ofNullable(title);
        System.out.println("Setting document title to " + title);
    }
    
//    private void goToNextState() {
//        if(state.valid(this)) state = state.nextState();
//        else System.out.println("Document is not valid for going to the next state: " + state.nextState());
//    }
    
    public void approve() {
        state = state.approve();
    }
    
    public void archive() {
        state = state.archive();
    }
    
    @Override
    public String toString() {
        return title.orElse("Unknown") + " is in the state: " + state;
                
    }
    
    
    
}
