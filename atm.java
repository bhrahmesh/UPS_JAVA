import java.util.Scanner;
public class atm{
     private double Balance;
     public double get_balance(){
        return this.Balance;

     }
     public void set_balance(double Balance){
        this.Balance= Balance;
     }
    static  void  withdraw(double Balance,int amt){
        if (Balance <= 0){
            System.out.println("Insuffisant balance");
        }
        else if (amt<Balance ){

            Balance-= amt;
            System.out.println("the balance after debit is "+Balance);

        }
        else{
            return ;
        }
     }
     void  credit (double Balance , int amt ){
        Balance+=amt;
        System.out.println("the balance after deposit is "+Balance);
     }


    public static void main (String args[]){
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the amount");
        int amt = ip.nextInt();
        System.out.print("Enter the balance");
        double Balance = ip.nextInt();
        atm obj = new atm();
        withdraw(Balance,amt);
        obj.credit(Balance, amt);
        
    }
}