package ch04_FactoryMethod.A2.idcard;

import ch04_FactoryMethod.A2.framework.*;

public class IDCard extends Product {
    private String owner;
    private int serial;
    IDCard(String owner, int serial) {
        System.out.println(owner + "(" + serial + ")のカードを作ります。");
        this.owner = owner;
        this.serial = serial;
    }
    public void use() {
        System.out.println(owner + "(" + serial + ")のカードを使います。");
    }
    public String getOwner() {
        return owner;
    }
    public int getSerial() {
        return serial;
    }
}
