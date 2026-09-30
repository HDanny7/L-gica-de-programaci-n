package notes;

import java.util.Scanner;

public class ValidadorTipos {

    static Scanner sc = new Scanner(System.in);

    public static int ValidarEnteros() {

        int value = sc.nextInt();

        return value;
    }

    public static String ValidarString(){
        String value = sc.nextLine();

        return value;
    }
}
