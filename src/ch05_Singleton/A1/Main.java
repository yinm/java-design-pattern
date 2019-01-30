package ch05_Singleton.A1;

public class Main {
    public static void main(String[] args) {
        TicketMaker obj1 = TicketMaker.getInstance();
        TicketMaker obj2 = TicketMaker.getInstance();

        System.out.println("obj1: " + obj1.getNextTicketMaker());
        System.out.println("obj1: " + obj1.getNextTicketMaker());
        System.out.println("obj2: " + obj2.getNextTicketMaker());
    }
}
