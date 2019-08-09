package facadedemo;

public class FacadeDemo {

    public static void main(String[] args) {

       new Client(
                new CalcFacade(
                        new Calc(), 
                        new Logger()
                        )
                )
                .useCalc();
       
    }

}
