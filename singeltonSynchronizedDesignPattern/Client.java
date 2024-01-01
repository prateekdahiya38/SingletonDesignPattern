package singeltonSynchronizedDesignPattern;

public class Client {
    public static void main(String[] args) {
        SyncSingelton s1 = SyncSingelton.objCreatation();
        SyncSingelton s2 = SyncSingelton.objCreatation();
        SyncSingelton s3 = SyncSingelton.objCreatation();
        SyncSingelton s4 = SyncSingelton.objCreatation();
    }
}
