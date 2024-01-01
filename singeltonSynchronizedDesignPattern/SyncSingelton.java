package singeltonSynchronizedDesignPattern;

public class SyncSingelton {
    
    private static SyncSingelton instance;

    private SyncSingelton() {

    }

    public static SyncSingelton objCreatation(){
        if (instance == null){
            synchronized (SyncSingelton.class) {
                if (instance == null) {
                    instance = new SyncSingelton();
                }
            }
        }
        return instance;
    }
}
