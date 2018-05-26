package Models.Orders;

import java.util.Date;

public class ImmediateOrder extends Order {
    private Date TimeLimit;

    public Date getTimeLimit() {
        return TimeLimit;
    }

    public void setTimeLimit(Date timeLimit) {
        TimeLimit = timeLimit;
    }

    public boolean hasTime(){
        return (new Date().getTime() - TimeLimit.getTime()) > 0;
    }
}
