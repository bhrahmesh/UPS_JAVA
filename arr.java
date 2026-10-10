import java.util.Arrays;
import java.util.Scanner;

class arr {
    public static int[][] two_sum(int[] arr , int n , int target ){
        int [][] dummy = new int[n][2];
        for(int i = 0  ;i<n  ;i++){
            for (int j = i ;j<n;j++){
                if (arr[i] + arr[j] == target ){
                     dummy[i][0]=i;
                     dummy[i][1]=j;
                }
            }
        }
        return dummy;
    }
    public static int[] search(int [][] arrs, int n , int m, int target ){
        for(int i =0;i<n;i++){
            for (int j = 0;j<m;j++){
                if ( arrs[i][j] == target ){
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{-1, -1};
    }
    public static  int [][] sume ( int [][]arr, int [][] arr2,int n , int m ) {
            int[][] sum_arr = new int [n][m];
            for (int i =0 ;i<n;i++){
                for (int j = 0 ;j<m;j++){
                    sum_arr[i][j] = arr[i][j]+arr2[i][j];
                }
            }
            return sum_arr;
    }
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
        Scanner ip2 = new Scanner (System.in);
        System.out.print("enter the ip");
        int m = ip2.nextInt();
        int[][] arr= new int[n][m];
        int [][] arr2 = new int[n][m];
        for (int i =0;i<n;i++){
            for (int j = 0 ;j<m;j++){
                System.out.print("Enter" + i +j +":") ;
                arr[i][j] = ip.nextInt();
                
            }
           
            
        }



        for (int i =0;i<n;i++){
            for (int j = 0 ;j<m;j++){
                System.out.print("Enter" + i +j +":") ;
                arr2[i][j] = ip.nextInt();
                
            }
           
            
        }
        int arrs [][]= sume(arr,arr2,n,m);
        for (int x =0 ;x<n;x++){
            for(int k = 0; k<m;k++){

            
            System.out.print(arrs[x][k]+" ");
        }
        System.out.println();
    } 
    Scanner ta = new Scanner(System.in);
    System.out.print("ENTER THE TARGET: ");
    int target = ta.nextInt();
    System.out.println(Arrays.toString(search(arrs, n, m, target)));
    
       
        
    }
}