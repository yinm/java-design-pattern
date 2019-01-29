package ch04_FactoryMethod.Sample.idcard;

import ch04_FactoryMethod.Sample.framework.*;

public class IDCard  extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }
    public String getOwner() {
        return owner;
    }
}
