package Model;


public class UIObserver implements Observer {
    @Override
    public void update(String orderStatus) {
        System.out.println("User Interface updated. Order status changed to: " + orderStatus);
    }
}
