package facadedemo;

public class Client {

    private CalcFacade calcFacade;
    
    public Client(CalcFacade calcFacade) {
        this.calcFacade = calcFacade;
    }

    public void useCalc() {
        System.out.println(calcFacade.processPlus(10, 20));
        calcFacade.log(Client.class.getSimpleName() + " ended.");
    }
    
}
