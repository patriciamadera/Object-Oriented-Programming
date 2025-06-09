package Model;

public class InventoryObserver implements Observer {
    @Override
    public void update(String orderStatus) {
        System.out.println("Inventory system updated. New order status: " + orderStatus);
    }
}

