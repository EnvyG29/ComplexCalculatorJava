package start;

import java.util.Scanner;

public class Input {

    protected String input(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine().toLowerCase();
    }
}
