import java.util.Scanner;
//import Exception;

class Coustom_exception extends Exception {
    public Coustom_exception(String Message) {
        super(Message);
    }
}

public class exception {
    public static void main(String args[]) {
        Scanner ip = new Scanner(System.in);
        System.out.print("ENTER THE AGE ");
        int age = ip.nextInt();
        try {
            if (age < 18) {
                throw new Coustom_exception("THE CANDIDATE IS BELOW THE AGE ");
            }
            System.out.println("The age is valid ");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            ip.close();
        }

        // int res;
        // try{

        // res = b/a;
        // if(a==0){
        // throw new Exception("a must not be zero ");
        // }

        // }
        // catch (Exception e){
        // System.out.println("CANT divide "+e.getMessage());
        // }
        // System.out.println("Program continues running Successfully");

    }
}