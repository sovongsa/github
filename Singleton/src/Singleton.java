
public class Singleton {
    
    private static class Loader {
        static Singleton INSTANCE = new Singleton();
    }
    
    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        return Loader.INSTANCE;
    }
    

}
