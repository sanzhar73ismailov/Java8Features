package inerfacefeatures;

public class InterfaceAppMain {

    public static void main(String[] args) {
        //use default method
        System.out.println("====== Check default methods");
        NewInterface obj1 = new NewInterfaceImpl();
        obj1.methodDefault();

        NewInterface obj2 = new NewInterfaceImplOverDefMethod();
        obj2.methodDefault();

        //use static methods
        System.out.println("====== Check static methods");
        // obj1.metStat(); -- illegal
        //NewInterfaceImpl.metStat();
        NewInterface.metStat();
    }
}
