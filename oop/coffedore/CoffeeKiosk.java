import java.util.ArrayList; 
public class CoffeKiosk{
    ArrayList<Item> menu ;
    ArrayList<Order> orders ;
public CoffeKiosk() {
   this.menu =  new ArrayList<Item>();
   this.orders =new ArrayList <Order>();
    }
    public ArrayList<Item> getMenu() {
        return this.menu;
    }

    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
 
    public  void addMenuItem(String name , double price){
        index =menu.size();
        Item ItemMenu =new Item(name,price,index); 
        menu.add(ItemMenu); 
    }
    public void displayMenu(){
        for(int i =0;i<menu.size();i++){
            system.out.println(menu.get(i).name);
            system.out.println(menu.get(i).price);
            system.out.println(menu.get(i).index);
        }
    }
        public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order OrderNew=new Order(name) ;
        orders.add(OrderNew);


        // Show the user the menu, so they can choose items to add.
            displayMenu();
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
          int itemNumCa=Integer.parseInt(itemNumber);
          Item ResultItem = menu.get(itemNumCa);
        OrderNew.setItems(ResultItem);

            // Get the item object from the menu, and add the item to the order
            // Ask them to enter a new item index or q again, and take their input
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
            
        }
        // After you have collected their order, print the order details 
        system.out.println(OrderNew.name);
        OrderNew.displayOrders();
    	// as the example below. You may use the order's display method.
        
    }
   
}