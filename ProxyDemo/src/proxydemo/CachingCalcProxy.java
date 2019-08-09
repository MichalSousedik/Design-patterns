package proxydemo;

import java.util.HashMap;
import java.util.Map;

public class CachingCalcProxy implements Calculator {

    private Calculator calc;
    
    private Map<String, Double> cache = new HashMap<String, Double>();
    
    public CachingCalcProxy(Calculator calc) {
        this.calc = calc;
    }
    
    @Override
    public double plus(double x, double y) {
        if(cache.containsKey(keyConverter(x,y))) {
            System.out.println("Using cache");
            return cache.get(keyConverter(x,y));
        }
        Double result = calc.plus(x, y);
        cache.put(keyConverter(x,y), result);
        return result;
    }
    
    private String keyConverter(double x, double y) {
        return Math.min(x,y)+"+"+Math.max(x, y);
    }

}
