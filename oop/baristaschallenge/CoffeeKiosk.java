import ArrayList.java;
public class CoffeeKiosk{
ArrayList<ItemOrder> menu ;
ArrayList<Order> orders;


    public CoffeeKiosk(ArrayList<ItemOrder> menu, ArrayList<Order> orders) {
        this.menu = menu;
        this.orders = orders;
    }

    public CoffeeKiosk() {
    }

    public ArrayList<ItemOrder> getMenu() {
        return this.menu;
    }

    public void setMenu(ArrayList<ItemOrder> menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addMenuItem(ItemOrder item){
            this.menu.add(item);
    }
}