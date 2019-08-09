package visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        
        Triangle t = new Triangle("a",1,2,3);
        System.out.println(t);
        t.accept(new ShapeDoublerVisitor());
        System.out.println(t);
        Rectangle r = new Rectangle("a",1,2,3,4);
        System.out.println(r);
        r.accept(new ShapeDoublerVisitor());
        System.out.println(r);
        
    }

}
