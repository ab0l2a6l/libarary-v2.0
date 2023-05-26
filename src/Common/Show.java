package Common;

public class Show {

    public static byte menu() {
        System.out.println("1.add book\n2.add person\n3.exit");
        return StaticScanner.getDada().nextByte();
    }
}
