import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        System.out.print("Masukan angka : ");
        angka = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            angka -= 3;
        }
        System.out.println("hasil akhir = " + angka);
        if (angka % 2 == 0) {
            System.out.println("hasil akhir adalah  bilangan genap");
        } else {
            System.out.println("hasil akhir adalah  bilangan ganjil");
    }
}
}