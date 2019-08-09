package flyweightdemo;

public class Symbol {

    private char glyph;

    public Symbol(char glyph) {
        this.glyph = glyph;
    }    
    
    public void draw(int x, int y) {
        System.out.println("drawing " + glyph + " on " + x + ", " + y);
    }
    
}
