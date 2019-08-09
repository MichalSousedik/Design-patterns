package visitor;

public interface ShapeVisitor {
    void visitTriangle(Triangle triangle);
    void visitRectangle(Rectangle rectangle);
}
