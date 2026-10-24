import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
//import java.util.Hashtable;
import java.util.HashMap;

public class JavaProgram {
    public static void Remove_duplicates(ArrayList<Integer> num){
        int cnt = 0 ;
        HashSet<Integer> st = new HashSet<>();
        for (int x :num){
            if(!st.contains(x)){
            st.add(x);
            cnt++;
        }}
        
        System.out.println("THE UNIQUE ELEMETS ARE :" +st + "AND THE NO OF UNIQUE ELMTS ARE " + cnt);

        
        

    }
    public static void findArmstrongNumbers(int n) {
        System.out.println("Armstrong numbers up to " + n + ":");
        for (int i = 0; i < n; i++) {
            int cur = i;
            int tot = 0;

            int numDigits = String.valueOf(i).length();
            while (cur > 0) {
                int digit = cur % 10;
                tot += Math.pow(digit, numDigits);
                cur /= 10;
            }
            
            if (tot == i) {
                System.out.println(i);
            }
        }
    }

    public static void Word_freq(String[] str_Strings){
        HashMap <String ,Integer> mp = new HashMap<>();
        for (String word : str_Strings){
            mp.put(word,mp.getOrDefault(word, 0)+1);
        }
        for(String ch :mp.keySet()){
                System.out.println(ch + ":" + mp.get(ch));
        }


    }


    public static void findSecondLargest(ArrayList<Integer> arr) {
     
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
   if (arr.size() < 2) {
            return;
        }
        for (int i : arr) {
            if (i > first) {
                second = first;
                first = i;
            } else if (i > second && i != first) {
                second = i;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("only one maxi is present  ");
        } else {
            System.out.println("Second largest is "+ second);
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.println("ENTER THE SENTANCE");
        String str = ip.nextLine().toLowerCase();
        String[] str_arr= str.split("\\s+");


        //System.out.print("range to theee  Arms no: ");
      //  int limit = ip.nextInt();


        //findArmstrongNumbers(limit);
        // ArrayList<Integer> nums = new ArrayList<>();
        // System.out.println("\n nos to second_largest:");
        // for (int i = 0; i < 5; i++) {
        //     nums.add(ip.nextInt());
        // }
        //findSecondLargest(nums);
       // Remove_duplicates(nums);

       Word_freq(str_arr);
        
        ip.close();
    }
}
