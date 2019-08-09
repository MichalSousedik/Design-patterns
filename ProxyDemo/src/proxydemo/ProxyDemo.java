package proxydemo;

public class ProxyDemo {

    public static void main(String[] args) {
        Calculator calc = new Calc();
        CachingCalcProxy cachingCalcProxy = new CachingCalcProxy(calc);
        SmartCalcProxy smartCalcProxy = new SmartCalcProxy(cachingCalcProxy);
        InterceptingCalcProxy interceptionProxy = new InterceptingCalcProxy(smartCalcProxy);
        LoggingCalcProxy loggingProxy = new LoggingCalcProxy(interceptionProxy);
        Client client = new Client(loggingProxy);
        client.useCalc();
        client.useCalc();

    }

}
