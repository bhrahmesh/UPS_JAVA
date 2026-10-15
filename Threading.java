class A extends  Thread{
        public void run(){
            try{
            sleep(1000);
            }
            catch(Exception e){
                System.out.print(e.getMessage());
            }
            System.out.println("A executes");
        }
}
class B extends  Thread{
        public void run(){
            System.out.println("B executes");
        }
}

public class Threading {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
      

        //Thread thread = new Thread();
        obj1.start();
        obj2.start();

    }
}