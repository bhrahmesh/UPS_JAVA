import java.util.Scanner;

class arr {
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
        System.err.println();
    }
    
       
        
    }
}