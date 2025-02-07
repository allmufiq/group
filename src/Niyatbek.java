import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;
public class Niyatbek {
    public static void main(String[] args) {
        System.out.println("merhaba");
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }
        Scanner scanner = new Scanner(System.in);


        System.out.print("Sonni kiriting: ");
        int son = scanner.nextInt();


        boolean tub = true;

        if (son < 2) {
            tub = false;
        } else {
            for (int i = 2; i <= Math.sqrt(son); i++) {
                if (son % i == 0) {
                    tub = false;
                    break;
                }
            }
        }


        if (tub) {
            System.out.println(son + " tub sondir.");
        } else {
            System.out.println(son + " tub son emas.");
        }

        scanner.close();

    }





}

