import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        Order orderGuest1 = new Order();
        Order orderGuest2 = new Order();
        Order orderWithName1 = new Order("Fatima");
        Order orderWithName2 = new Order("Mousa");
        Order orderWithName3 = new Order("Harahsheh");
        ItemOrder itemOne = new ItemOrder("Computer", 1000);
        ItemOrder itemTwo = new ItemOrder("HeadPhone", 500);
        orderGuest1.addItem(itemOne);
        orderWithName3.addItem(itemTwo);
        orderWithName3.display();

    }
}
