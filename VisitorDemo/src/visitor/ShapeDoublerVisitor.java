package visitor;

public class ShapeDoublerVisitor implements ShapeVisitor {

    @Override
    public void visitTriangle(Triangle triangle) {
        double[] vertecies = triangle.getVertecies();
        vertecies[0] *= 2; 
        vertecies[1] *= 2;
        vertecies[2] *= 2;
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        double[] vertecies = rectangle.getVertecies();
        vertecies[0] *= 2; 
        vertecies[1] *= 2;
        vertecies[2] *= 2;
        vertecies[3] *= 2;
    }

}
