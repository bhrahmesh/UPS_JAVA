
class TicketCounter {
    int tickets = 10;

    synchronized void bookTickets(String name, int count) {
        if (tickets >= count) {
            System.out.println(name + " booked " + count + " tickets");
            tickets -= count;
            System.out.println("Tickets remaining: " + tickets);
        } else {
            System.out.println(name + " could not book tickets");
            System.out.println("Tickets available: " + tickets);
        }
    }
}


class Customer extends Thread {
    TicketCounter cnt;

    Customer(TicketCounter cnt, String name) {
        super(name);
        this.cnt = cnt;
    }

    public void run() {
        cnt.bookTickets(getName(), 4);
    }
}

public class Thread_mananagement {
    public static void main(String[] args) throws InterruptedException {
        TicketCounter cnt = new TicketCounter();
        Customer c1 = new Customer(cnt, "Customer 1");
        Customer c2 = new Customer(cnt, "Customer 2");
        Customer c3 = new Customer(cnt, "Customer 3");
        c1.start();
        c2.start();
        c3.start();
        c1.join();
        c2.join();
        c3.join();

        System.out.println("Final tickets: " + cnt.tickets);
    }
}
