package example.lesson23.Singleton;

public class Singleton {
    //1
//    private static Singleton instance;
//    private Singleton(){
//
//    }
//
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//            return instance;
//
//    }
     //2
//private static Singleton instance = new Singleton();
//    private Singleton(){
//
//    }
//    private static Singleton getInstance(){
//        return instance;
//    }
    //3
    private Singleton() {
    }

    private static final class InstanceHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return InstanceHolder.instance;
    }

}


