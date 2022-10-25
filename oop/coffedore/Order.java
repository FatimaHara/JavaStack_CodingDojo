import java.util.ArrayList;
public class Order {
    String name ;
    double total ;
    boolean ready ;
    ArrayList<Item> items ;

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotal() {
        return this.total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isReady() {
        return this.ready;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items.add(items);
    }
    public void displayOrders(){
        for(int i =0;i<items.size();i++){
            system.out.println(items.get(i).name);
            system.out.println(items.get(i).price);
        }
    }

}