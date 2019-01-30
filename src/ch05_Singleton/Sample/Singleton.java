package ch05_Singleton.Sample;

public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
