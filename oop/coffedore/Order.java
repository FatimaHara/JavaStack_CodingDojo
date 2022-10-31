import java.util.ArrayList;
public class Order {
    private  String name ;
    private double total ;
    private boolean ready ;
   private ArrayList<Item> items =new ArrayList<Item>() ;
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

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }


    public Order(String name) {
        this.name = name;
        this.total = 0;
        this.ready = false;
        this.items =new ArrayList<>();
    }

    public void addItem(Item items){
            // this.items =new ArrayList<>();
            this.items.add(items);
            this.total+=items.getPrice();
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
        System.out.println(this.name );
        System.out.println("Thank You For Your Order" + this.name + "Your Order Details :");
        for(int i =0;i< this.items.size();i++){
            System.out.println( this.items.get(i).getName()  +  " -- " +  this.items.get(i).getPrice());

        }
        System.out.println( "Your Totals : "  + this.total);
        }
   public  double getOrderTotal(){
     double totalAmount=0;
    for(int i =0;i< this.items.size();i++){
        totalAmount+=items.get(i).getPrice();
   }
   System.out.println(this.items.size());
   return totalAmount ;
}
}