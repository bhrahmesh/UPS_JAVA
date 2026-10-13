//  import java.util.Scanner;
//  class transaction{
//     private int acc_no ;
//     private double balanc ;
//      public double get_balanc(){
//         return this.balanc;
//     }
//     public void set_balanc(double balanc){
//         this.balanc= balanc; 
//     }

//     public int get_acc_no(){
//         return this.acc_no;
//     }
//     public int set_acc_no(int acc_no){
//         this.acc_no= acc_no;
//     }



    
// }
// public class payment extends transaction{
//     void upi(acc_no,balanc){
//         Scanner p = new Scanner(System.in);
//         System.out.print("ENTER THE AMOUNT ");
//         int amt = p.nextInt();
        
//         System.out.print("ENTER THE PIN ");

//         int pin = p.nextInt();
//         void debit(int amt, double balanc){
//         if(balanc >500){
//             if (amt<balanc) balanc-= amt;
//         }}

//         System.out.println("THE PAYMENET IS DONE BY UPI" );
//     }
  
//     public static void main (String args[]){
//         Scanner ip = new Scanner(System.in);
//         acc_no= ip.nextInt();
        

//     }
// }


import java.util.Scanner;

class Transaction {
    private int accNo;
    private double balance;
    int acc_id;
    public  Transaction(int acc_id){
        this.acc_id = acc_id;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccNo() {
        return this.accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
}

public class payment extends Transaction {
    public payment(int acc_id){
        super(acc_id);
    }
    public void upi(int accNo, double balance) {
        Scanner p = new Scanner(System.in);
        System.out.print("ENTER THE AMOUNT: ");
        int amt = p.nextInt();
        System.out.print("ENTER THE PIN: ");
        int pin = p.nextInt();
        debit(amt, balance);
    }

    public void debit(int amt, double balance) {
        if (balance > 500) {
            if (amt <= balance) {
                balance -= amt;
               
                setBalance(balance); 
                System.out.println("THE PAYMENT IS DONE BY UPI");
                System.out.println("REMAINING BALANCE: " + getBalance());
            } else {
                System.out.println("INSUFFICIENT BALANCE FOR THIS TRANSACTION.");
            }
        } else {
            System.out.println("TRANSACTION DENIED: Minimum balance of 500 required.");
        }
    }

    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        
    
        payment paymentObj = new payment(2);

        System.out.print("ENTER ACCOUNT NUMBER: ");
        int acc = ip.nextInt();
        paymentObj.setAccNo(acc);

        System.out.print("ENTER INITIAL BALANCE: ");
        double bal = ip.nextDouble();
        paymentObj.setBalance(bal);

        paymentObj.upi(paymentObj.getAccNo(), paymentObj.getBalance());
        
        ip.close();
    }
}
