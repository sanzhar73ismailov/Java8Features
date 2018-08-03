package inerfacefeatures;

/**
 *
 * @author admin
 */
public class NewInterfaceImplOverDefMethod implements NewInterface{

    @Override
    public void methodDefault() {
        System.out.println("<<< Start NewInterfaceImplOverDefMethod.methodDefault");
        NewInterface.super.methodDefault(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("methodDefault of NewInterfaceImplOverDefMethod");
        System.out.println(">>> Finish NewInterfaceImplOverDefMethod.methodDefault");
    }

}
