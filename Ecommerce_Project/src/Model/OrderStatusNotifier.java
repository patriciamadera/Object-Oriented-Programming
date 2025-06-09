package Model;

import java.util.ArrayList;
import java.util.List;

public class OrderStatusNotifier {
    private List<Observer> observers = new ArrayList<>();
    private String orderStatus;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(orderStatus);
        }
    }
}

