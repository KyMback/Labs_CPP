package Models.Persons.Clients;

import Models.Company;
import Models.Orders.Order;

import java.util.LinkedList;
import java.util.List;

public abstract class Client {
    private String Name = "defaultName";
    protected int Money = 10;
    protected List<Order> OrdersList = new LinkedList();

    Client() {
    }

    Client(String name, int money) {
        this.setName(name);
        this.setMoney(money);
    }

    public int getMoney() {
        return Money;
    }

    protected void setMoney(int money) {
        Money = money;
    }

    public String getName() {
        return Name;
    }

    private void setName(String name) {
        Name = name;
    }

    public void toOrder(Company company) {
        Order order = company.getNewOrder();
        OrdersList.add(order);
    }

    public void pay() {
        if(OrdersList.isEmpty()){
            return;
        }
        Order order = OrdersList.get(0);
        if(order.getNumber() > this.getMoney()){
            return;
        }
        OrdersList.remove(order);
        this.setMoney(this.getMoney() - order.getQuantity());
    }
}
