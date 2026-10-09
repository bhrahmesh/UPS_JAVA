import java.util.Scanner;

class arr {
    public static int add_even(int []arr){
        int sum = 0;
        for (int x : arr){
            if(x%2==0){
                sum+=x;
            }
        }
        return sum ;


    }
    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        System.out.print("enter the ip");
        int n = ip.nextInt();
        int[] arr= new int[n];
        for (int i =0;i<n;i++){
            arr[i] = ip.nextInt();
            
        }
       
        System.out.println(add_even(arr));
    }
}