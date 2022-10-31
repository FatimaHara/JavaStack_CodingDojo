import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        ItemOrder ItemOne =   new ItemOrder() ;
        ItemOrder ItemTwo =   new ItemOrder() ;
        ItemOrder ItemThird = new ItemOrder() ;
        ItemOrder ItemForth = new ItemOrder() ;

        ItemOne.name= "mocha";
        ItemTwo.name= "latte";
        ItemThird.name="drip coffee";
        ItemForth.name="capuccino";
        ItemOne.price= 3.5;
        ItemTwo.price= 9.5;
        ItemThird.price=5;
        ItemForth.price=2.5;


        Order Order1 =new Order();  
        Order Order2 =new Order(); 
        Order Order3 =new Order(); 
        Order Order4 =new Order();  

        Order1.name= "Cindhuri";
        Order2.name = "Jimmy";
        Order3.name="Noah" ;
        Order4.name="Sam" ;
   
       
  
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", Order1.name);
        // System.out.printf("Total: %s\n", Order1.total);
        // System.out.printf("Ready: %s\n", Order1.ready);
        Order2.items.add(ItemOne);
        // Order2.total+=ItemOne.price;
        // Order3.items.add(ItemForth);
        // Order3.total+=ItemForth.price;
        // Order4.items.add(ItemTwo);
        // Order4.total+=ItemTwo.price;
        // Order1.ready=true;
        // Order4.items.add(ItemTwo);
        // Order4.items.add(ItemTwo);
        // Order4.total+=ItemTwo.price*2;
        // Order2.ready =true ;

    }
}