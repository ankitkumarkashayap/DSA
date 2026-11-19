
package Only_String_Qustion.string;
import java.lang.*;

public class Vehical extends Thread {
    int distance;
    String name;

    Vehical() {

    }

    Vehical(int distance, String name) {
        this.distance = distance;
        this.name = name;

    }

    public void drive() {
        System.out.println("========" + name + "=========");
        for (int i = 0; i <= distance; i++) {
            System.out.println("has coverd\t" + i + "\tkm");
        }
        System.out.println("======== "+name+ " has  descnition==========");
    }




    public void run(){
        drive();

    }

}
