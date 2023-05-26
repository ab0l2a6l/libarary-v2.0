package Common;
import Common.StaticScanner;

public class Show {

    public static byte menu() {
        System.out.println("1.add book\n2.add person");
        return StaticScanner.getDada().nextByte();
    }
}
