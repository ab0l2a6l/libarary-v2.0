package Common;

import java.util.Scanner;

public class StaticScanner {
    Scanner input = new Scanner(System.in);

    public static Scanner getDada() {
        Scanner input = new Scanner(System.in);
        return input;
    }
}
