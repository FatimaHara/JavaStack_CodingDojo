public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattePrice =7.5;
        double cappuccinoPrice =4.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam" ;
        String customer3 = "Jimmy" ;
        String customer4 = " Noah" ;

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 =false ;
        boolean isProcssingOrder3 = true;
        boolean isReadyOrder4 = false;
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1);
         // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        if (isReadyOrder4 == true){
            System.out.println(customer4 + readyMessage + "," + "And" + " "+ displayTotalMessage + mochaPrice);
        }
        System.out.println ( "Mrs" + " " +  customer2  + " " + displayTotalMessage + lattePrice * 2);
        if (isReadyOrder2 ==true){
            System.out.println(false);
        }
        else if (isReadyOrder2 == false) {
            System.out.println(true);
        }
         double total =  mochaPrice + lattePrice ;
        System.out.println(  "Mrs" + " " +  customer3 + " " + displayTotalMessage + total);

    }
}
