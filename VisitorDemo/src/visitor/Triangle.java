package visitor;

public class Triangle extends Shape {

    private double[] vertecies = new double[3];
    
    public Triangle(String name, double a, double b, double c) {
        super(name);
        vertecies[0]=a;
        vertecies[1]=b;
        vertecies[2]=c;
    }

    public double[] getVertecies() {
        return vertecies;
    }

    public void setVertecies(double[] vertecies) {
        this.vertecies = vertecies;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitTriangle(this);
    }
    
    @Override
    public String toString() {
        return vertecies[0] + " " + vertecies[1] + " " + vertecies[2];
    }
    
    

}
