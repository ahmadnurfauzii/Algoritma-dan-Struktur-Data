import java.util.Scanner;
public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               int input;
        System.out.println("PENENTU KELIPATAN 2,6,15");
        System.out.print("Masukan angka : ");
        input = sc.nextInt();

        if (input % 2 == 0 && input % 6 == 0 && input % 15 == 0) {
            System.out.println("Bilangan kelipatan 2,6,15");
        } else if (input % 2 == 0 && input % 6 == 0) {
            System.out.println("Bilangan kelipatan 2,6");
        } else if (input % 6 == 0 && input % 15 == 0) {
            System.out.println("Bilangan kelipatan 6,15");
        } else if (input % 15 == 0 && input % 2 == 0) {
            System.out.println("Bilangan kelipatan 2,15");
        } else if (input % 2 == 0) {
            System.out.println("Bilangan kelipatan 2");
        } else if (input % 6 == 0) {
            System.out.println("Bilangan kelipatan 6");
        } else if (input % 15 == 0) {
            System.out.println("Bilangan kelipatan 15");
        } else {
            System.out.println("Bilangan bukan kelipatan 2,6,15");
    }
}
}