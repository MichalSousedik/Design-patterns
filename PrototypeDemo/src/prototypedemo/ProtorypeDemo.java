package prototypedemo;

public class ProtorypeDemo {

    public static void main(String[] args) {
        ExpensiveInit expensiveInit = new ExpensiveInit();   
        System.out.println(expensiveInit.getAnswer());
        try {
            ExpensiveInit expensiveInit2 = (ExpensiveInit) expensiveInit.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(expensiveInit.getAnswer());  
        
        ExpensiveInit expensiveInit3 = expensiveInit.clone2();
        System.out.println(expensiveInit3.getAnswer());
        
    }
    
}
