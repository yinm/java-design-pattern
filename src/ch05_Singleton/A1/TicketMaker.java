package ch05_Singleton.A1;

public class TicketMaker {
    private int ticket = 1000;
    public int getNextTicketMaker() {
        return ticket++;
    }
}
