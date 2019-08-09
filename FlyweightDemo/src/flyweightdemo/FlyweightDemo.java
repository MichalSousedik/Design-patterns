package flyweightdemo;

public class FlyweightDemo {

    public static void main(String[] args) {
        SymbolFactory factory = new SymbolFactory();
        factory.get('a').draw(10, 10);
        factory.get('b').draw(10, 11);
        factory.get('c').draw(10, 12);
        factory.get('c').draw(10, 13);
        System.out.println(factory.symbolCount());

    }

}
