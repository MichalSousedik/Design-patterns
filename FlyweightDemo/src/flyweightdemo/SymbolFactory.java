package flyweightdemo;

import java.util.HashMap;
import java.util.Map;

public class SymbolFactory {
    
    private Map<Character, Symbol> symbols = new HashMap<>();
    
    public Symbol get(char glyph) {
        if(!symbols.containsKey(glyph)) {
            symbols.put(glyph, new Symbol(glyph));
        }
        return symbols.get(glyph); 
    }
    
    public int symbolCount() {
        return symbols.size();
    }
}
