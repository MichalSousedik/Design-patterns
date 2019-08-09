
public class UpperTransformator implements Transformator {

    @Override
    public String modify(String string) {
        return string.toUpperCase();
    }

}
