package Models;

import Enums.OrderStatus;

public class Order {
    private int Number = 1;
    private String Subject = "defaultName";
    private int Quantity = 1;
    private OrderStatus OrderStatus = Enums.OrderStatus.Raw;

    public Order(int number, String subject, int quantity, OrderStatus orderStatus){
        this.setNumber(number);
        this.setSubject(subject);
        this.setQuantity(quantity);
        this.setOrderStatus(orderStatus);
    }

    public Order(){}

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public Enums.OrderStatus getOrderStatus() {
        return OrderStatus;
    }

    private void setOrderStatus(Enums.OrderStatus orderStatus) {
        OrderStatus = orderStatus;
    }

    public void initOrder(){
        if(this.getOrderStatus() == Enums.OrderStatus.Raw){
            this.setOrderStatus(Enums.OrderStatus.Initialized);
        }
    }
}
