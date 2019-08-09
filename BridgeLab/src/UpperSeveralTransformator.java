import java.util.ArrayList;
import java.util.List;

public class UpperSeveralTransformator implements Transformator {

    
    public String[] modify(String... strings) {
        List<String>stringList = new ArrayList<>();
        for(int i = 0; i < strings.length; ++i) {
            stringList.add(strings[i].toUpperCase());
        }
        return stringList.toArray(new String[0]);
    }
    
    @Override
    public String modify(String string) {
        throw new UnsupportedOperationException();
    }

}
