import java.util.ArrayList;
public class Order {
    private  String name ;
    private double total ;
    private boolean ready ;
   private ArrayList<ItemOrder> items =new ArrayList<ItemOrder> ;
;

    public Order() {
        this.name = "Guest";
        this.total = 0;
        this.ready = false;
        this.items =new ArrayList<> ();

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

    public ArrayList<ItemOrder> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<ItemOrder> items) {
        this.items = items;
    }


    public Order(String name) {
        this.name = name;
        this.total = 0;
        this.ready = false;
        this.items =new ArrayList<>();
    }

    public void addItem(ArrayList<ItemOrder> items){
            this.items =new ArrayList<>();
            this.items.addAll(items);
            // this.total+=items.getPrice();
            
    }
    public void getStatusMessage(){
        if (this.ready){
            System.out.println("Your order is ready");

        }
        else {
            System.out.println("Thank you for waiting. Your order will be ready soon.");
        }
    }

    public void display(){
        System.out.println(this.name);
        for(int i =0;i< this.items.size();i++){
            System.out.println(this.items.get(i).getPrice());
            System.out.println(this.items.get(i).getName());

        }
        System.out.println(this.total);
        }
   public  double getOrderTotal(){
     double totalAmount=0;
    for(int i =0;i< this.items.size();i++){
        totalAmount+=items.get(i).getPrice();
   }
   return totalAmount ;
}