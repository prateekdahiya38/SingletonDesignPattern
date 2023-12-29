package singeltonDesignPattern;

public class Client {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getObj();
        Singleton s2 = Singleton.getObj();
        Singleton s3 = Singleton.getObj();
        Singleton s4 = Singleton.getObj();


    }
}
