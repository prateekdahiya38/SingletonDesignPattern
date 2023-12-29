package singeltonDesignPattern;

public class Singleton {

    private static Singleton Obj;
    private Singleton(){

    }

    public static Singleton getObj(){
        if (Obj == null) {
            Obj = new Singleton();
        }
        return (Obj);
    }
}
