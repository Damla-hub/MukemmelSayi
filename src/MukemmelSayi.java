import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        while (true) {
            int total=0;
            System.out.print("Bir sayı giriniz: ");
            number = input.nextInt();
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    total += i;
                }
            }
            if (total == number) {
                System.out.println(number + " Mükemmel sayıdır.");
            } else {
                System.out.println(number + " Mükemmel sayı değildir.");
            }
        }
    }
}
