// creating a student application form using display method (oops)

import java.util.Scanner;

public class oops {
    String name ;
    String DOB;
    int rollno;
    String department;
    public void  disp(String name,String DOB,int rollno,String department){
        this.name = name;
        this.DOB = DOB;
        this.rollno = rollno;
        this.department= department;
        System.out.println(name+" " + DOB + " " + rollno+" " + department );
    }
    public static void main(String[] args){
            Scanner ip = new Scanner(System.in);

          
            String name   = ip.nextLine();
            String DOB = ip.nextLine();
            int  rollno = ip.nextInt();
            ip.nextLine();
            String department = ip.nextLine();
            oops obj = new oops();
            obj.disp(name, DOB, rollno, department);
            ip.close();
 
    }
}