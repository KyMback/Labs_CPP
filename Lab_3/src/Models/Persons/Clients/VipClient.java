package Models.Persons.Clients;

import Models.Company;
import Models.Orders.ImmediateOrder;

import java.util.Date;

public class VipClient extends Client {
    public void toOrder(Company company) {
        Date date = new Date();
        ImmediateOrder order = company.getNewImmediateOrder(date);
        OrdersList.add(order);
    }
}
