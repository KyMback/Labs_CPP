package Models;

import Models.Orders.ImmediateOrder;
import Models.Orders.Order;

import java.util.Date;

public class Company {
    private int money;
    private String Name;
    private String Plan;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlan() {
        return Plan;
    }

    public void setPlan(String plan) {
        Plan = plan;
    }

    public Order getNewOrder(){
        Order order = new Order();
        performOrder(order);
        return order;
    }

    public ImmediateOrder getNewImmediateOrder(Date date){
        ImmediateOrder order = new ImmediateOrder();
        order.setTimeLimit(date);
        performOrder(order);
        return order;
    }

    public void performOrder(Order order){
        order.initOrder();
    }
}
