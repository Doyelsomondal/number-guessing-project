// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //mini project
        Scanner Sc = new Scanner(System.in);
        int mynumber = (int) (Math.random()* 100);
        int userNUmber = 0;

        do {
            System.out.println("Guess my number (1-100):");

            int userNumber = Sc.nextInt();
            if (userNumber == mynumber) {
                System.out.println("CORRECT NUMBER");
                break;
            } else if (userNumber > mynumber) {
                System.out.println("YOUR NUMBER IS TOO LARGE");

            } else {
                System.out.println("YOUR NUMBER IS TOO SMALL");
            }

        } while (userNUmber >= 0);
        System.out.println("my number was:");
        System.out.println(mynumber);
    }
}
