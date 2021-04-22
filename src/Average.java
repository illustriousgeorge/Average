import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int num;
        System.out.println("Zadej kolik čísel chceš zadat");
        num = sc.nextInt();
        System.out.println("Zadej " + num + " čísel");
        for (int i = 0; i < num; i++) {
            sum += sc.nextDouble();
        }
        double avg = sum / num;
        System.out.println("Průměr čísel je: " + avg);
    }
}
