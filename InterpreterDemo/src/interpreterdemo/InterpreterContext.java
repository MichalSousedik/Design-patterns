package interpreterdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InterpreterContext {
    
    private Map<Character, Integer> variables = new HashMap<>();
    
    public Optional<Integer> getVariable(Character variable) {
        return Optional.ofNullable(variables.get(variable));
    }
    
    public void addVariable(Character variable, Integer value) {
        variables.put(variable, value);
    }

}
