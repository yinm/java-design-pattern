package ch05_Singleton.A1;

public class Main {
    public static void main(String[] args) {
        TicketMaker obj1 = new TicketMaker();
        TicketMaker obj2 = new TicketMaker();

        System.out.println("obj1: " + obj1.getNextTicketMaker());
        System.out.println("obj1: " + obj1.getNextTicketMaker());
        System.out.println("obj2: " + obj2.getNextTicketMaker());
    }
}
