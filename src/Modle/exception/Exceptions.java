package Modle.exception;

public class Exceptions {
    public static void validateGenre(byte temp) throws Exception {
        if (temp != 1 && temp != 2 && temp != 3)
            throw new Exception("number must be 1, 2, 3 ");
    }

    public static void validateSexuality(byte temp) throws Exception {
        if (temp != 1 && temp != 2)
            throw new Exception("number must be 1, 2 ");
    }

    public static void validetLibrarianOrBuyer(byte temp) throws Exception {
        if (temp != 2)
            throw new Exception("you can just a buyer");
    }
}
