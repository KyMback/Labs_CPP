package Models;

public class Company {
    public Order getNewOrder(){
        Order order = new Order();
        performOrder(order);
        return order;
    }

    public void performOrder(Order order){
        order.initOrder();
    }
}
