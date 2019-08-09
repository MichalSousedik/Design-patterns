package visitor;

public class Rectangle extends Shape {

    private double[] vertecies = new double[4];
    
    public Rectangle(String name, double a, double b, double c, double d) {
        super(name);
        vertecies[0]=a;
        vertecies[1]=b;
        vertecies[2]=c;
        vertecies[3]=d;
    }

    public double[] getVertecies() {
        return vertecies;
    }

    public void setVertecies(double[] vertecies) {
        this.vertecies = vertecies;
    }

    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visitRectangle(this);
    }
    
    @Override
    public String toString() {
        return vertecies[0] + " " + vertecies[1] + " " + vertecies[2] + " " + vertecies[3];
    }
    
    

}
