package interpreterdemo;

public class InterpreterDemo {

    public static void main(String[] args) {
        Sum sum1 = new Sum(new Literal(3), new Variable('x')); 
        Product prod1 = new Product(new Literal(4), new Literal(5)); 
        Sum sum2 = new Sum(sum1, prod1);
        InterpreterContext context = new InterpreterContext();
        context.addVariable('x', 10);
        System.out.println(sum2.interpreter(context));
    }
    
}
