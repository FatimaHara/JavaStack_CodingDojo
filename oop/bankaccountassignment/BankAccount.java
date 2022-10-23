public class BankAccount {
   private double checkingBalance ;
   private double savingsBalance ;
   private static double totalAmount =0 ;
    private static int numberOfAccounts = 0;
    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void depositAccount( double checkingBalanceAccount , double savingsBalanceAccount){
            checkingBalance+=checkingBalanceAccount;
            savingsBalance+=savingsBalanceAccount ;
            totalAmount +=checkingBalanceAccount+savingsBalanceAccount ;
    }
    public void withdrawMoney( double checkingBalanceAccount,double savingsBalanceAccount ){
        if(checkingBalance<checkingBalanceAccount){
                System.out.println("insufficient funds") ;
        }else{
            checkingBalance-=checkingBalanceAccount ;
            totalAmount-=checkingBalanceAccount;
        }
        if(savingsBalance<savingsBalanceAccount){
            System.out.println("insufficient funds") ;
        }else{
            savingsBalance-=savingsBalanceAccount;
            totalAmount -=savingsBalanceAccount ;
        } 
         }
    public void seeAllTotal(){
        System.out.println(totalAmount);
    }  
}