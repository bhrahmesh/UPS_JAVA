import java.util.Scanner;
class calc{
public int add(int a,int b){
    return a+b;
}
public long multi(int a , int b){
    return a*b;
}
public double subtract(double a, double b){
    return a-b;
}
public double divide(double a, double b){
    return a/b;
}
}
public class Calculator{
    public static void main(String[] args){
        //calculator using methods
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE INPUT");
        int in = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("ENTER THE INPUT");
        int inp = input2.nextInt();
        
        calc c = new calc();
        System.out.println("Addition: " + c.add(in,inp));
        System.out.println("Multiplication: " + c.multi(in,inp)); 
        System.out.println("Subtraction: " + c.subtract(in,inp));
        System.out.println("Division: " + c.divide(in,inp));
        

 
    }
}