package memento;

public class MementoDemo {

    public static void main(String[] args) {
        Calc calc = new Calc();
        
        calc.plus(1);
        calc.plus(3);
        calc.plus(3);
        System.out.println(calc.getHistory());
        calc.undo();
        System.out.println(calc.getResult());
        System.out.println(calc.getHistory());
        calc.plus(1);
        calc.plus(3);
        System.out.println(calc.getResult());
        System.out.println(calc.getHistory());

    }

}
