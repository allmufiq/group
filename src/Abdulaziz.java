import java.util.Scanner;

public class Abdulaziz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Iltimos, biror butun son kiriting: ");
        int son = scanner.nextInt();


        if (son % 2 == 0) {
            System.out.println("Kiritilgan son juft.");
        } else {
            System.out.println("Kiritilgan son toq.");
        }

    }
}
