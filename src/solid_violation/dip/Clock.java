package solid_violation.dip;

import java.time.MonthDay;

public class Clock {
    public MonthDay monthDay(){
        return MonthDay.now();
    }
}
