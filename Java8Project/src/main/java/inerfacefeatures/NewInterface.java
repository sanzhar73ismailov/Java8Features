package inerfacefeatures;

public interface NewInterface {
    static void metStat(){
        System.out.println("NewInterface static method");
    }
    
    
    default void methodDefault(){
        System.out.println("Defult method");
    }
}
