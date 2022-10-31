import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Test coffeStation =new Test();
        coffeStation.addMenuItem("Coffee", 7);
        coffeStation.addMenuItem("Tea", 10);
        coffeStation.addMenuItem("Ice Latte", 3);
        coffeStation.addMenuItem("Apple", 5);
        coffeStation.newOrder();
    }
}