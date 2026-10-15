public class Runnable_implemented{
public static void main(String[] args) {
    Object obj = new Object();
    Thread t1 = new Thread(() -> {
        synchronized(obj) {
            System.out.println("thread 1 is running");
            try{
                obj.wait();
            }
            catch( Exception e){
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 is executed");
        }    
    });
    t1.start();
    Thread t2 =new Thread(new Runnable() {
        @Override
        public void run(){
            synchronized(obj){
                System.out.println("Thread 2 is running");
                
                    obj.notify();
                    try{
                        obj.wait()          ;          }
                        catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    System.out.println("Thread 2 is resumed");    
                    
                
                
               // System.out.println("Thread 2 is executed");
            }
        }
    });
    Thread  t3  = new Thread(new Runnable() {
        @Override 
        public  void run(){
            synchronized(obj){
                System.out.println("p3 is running");
                obj.notify();
                System.out.println("p3 is executed");

            }
        }
    });
    t2.start();
     try{
        Thread.sleep(1000);

    }
    catch( Exception e){
        throw new RuntimeException(e);
    }
    t3.start();
   

    





}
}