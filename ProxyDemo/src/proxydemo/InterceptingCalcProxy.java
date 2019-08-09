package proxydemo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class InterceptingCalcProxy implements Calculator{

    private Calculator calc;
    
    public InterceptingCalcProxy(Calculator calc) {
        this.calc = calc;
    }
    
    @Override
    public double plus(double x, double y) {
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        if(!getWeekendDays().contains(c.get(Calendar.DAY_OF_WEEK))) {
            return calc.plus(x, y);
        }
        System.out.println("Calculator does not work on weekend.");
        return 0;
    }

    private List<Integer> getWeekendDays(){
        return Arrays.asList(Calendar.SUNDAY, Calendar.SATURDAY);
    }

}
