package ch05_Singleton.A1;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();
    private int ticket = 1000;
    private TicketMaker() {
        System.out.println("インスタンスを生成しました。");
    }
    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    public int getNextTicketMaker() {
        return ticket++;
    }
}
