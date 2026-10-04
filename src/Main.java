import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var chef1 = WorkshopManagerSingleton.getInstance("Test","Test","test@gmail.com","test","test",1,new Date(202,1,2),new Date(2021,2,2),Status.Active);
        System.out.println(chef1);
        var chef2 = WorkshopManagerSingleton.getInstance("Test2222222222","Test","test@gmail.com","test","test",1,new Date(202,1,2),new Date(2021,2,2),Status.Active);
        System.out.println(chef2);
    }
}
