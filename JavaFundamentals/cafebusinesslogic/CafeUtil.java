import java.util.ArrayList;
public class CafeUtil{
        ArrayList<String> customersName = new ArrayList<String>();

   public int getStreakGoal(){
        int sumOfWeek =0;
        for (int i =0 ; i<=10;i++){
            sumOfWeek += i;

        }
        return sumOfWeek ;
        
   }
    public int getStreakGoal( int numWeeks){
        int sumOfWeek =0;
        for(int j=0;j<=numWeeks;j++){
            sumOfWeek+=j;
        }
    return sumOfWeek ;

    }
    double getOrderTotal(double[] prices){
        double pricesTotal =0;
        for(int x=0;x<prices.length;x++){
            pricesTotal+=prices[x];

        }
        return pricesTotal;
    }

    void displayMenu(ArrayList<String> menuItems){

        for(int y=0;y<menuItems.size();y++){

            System.out.println(y + " " + menuItems.get(y));

        }
    }
    void addCustomer( ){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println ("Hello" + userName );
        System.out.println("There are "+ customersName.size() + "people in front of you");
        customersName.add(userName);
        System.out.println(customersName);
    }
    




}