import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // int i=10;
        // while(i>0){
        // System.out.println(i);
        // i--;
        // }
        // Scanner ip = new Scanner(System.in);
        // System.out.print("ENTER THE START :");
        // int input = ip.nextInt();

        // Scanner op = new Scanner(System.in);
        // System.out.print("ENter the end");
        // int output = op.nextInt();

        // if (input % 2 == 1) {
        //     int i = input + 1;
        //     while (i < output) {
        //         i += 2;
        //         System.out.println(i);
        //     }

        // }
       Scanner ip = new Scanner (System.in);
      int input=  ip.nextInt();
       Scanner op = new Scanner (System.in);
       int output = op.nextInt();
    //   int sum =0 ;
    //   int i =0 ;
    //   do{
    //     sum=sum+i;
    //     i++;
    //    // System.out.println(sum);
    //   }while(sum<input);
    //   System.out.println(sum);

    //FACTORIAL
    // int i= 1;
    // int factorial =1;
    // do{
    //     factorial = factorial*i;
    //     i++;
    //     System.out.println(factorial);
    // }while(i<=input);

    //tables
    for (int i=0 ;i<=output;i++){
        System.out.println(input +"*" +i + "=" + (i* input));
    }



        // for (int i =0 ;i<51;i+=2){
        // System.out.println(i);
        // }
    }
}