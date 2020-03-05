package minggu4;


import java.util.Scanner;
public class fibonacciMain {
    public static void main(String[] args) {
        Scanner ujek = new Scanner(System.in);
                int angka, hitung1 = 0, hitung2 = 1, hitung;
        System.out.print("Masukan Angka : ");
        angka = ujek.nextInt();
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < angka; i++) {
            if (i == 0 || i == 1) {
                continue;
            }
            hitung = hitung1 + hitung2;
            System.out.println(hitung1 + " + " + hitung2 + " = " + hitung);
            hitung1 = hitung2;
            hitung2 = hitung;
        }
        System.out.println("Hasil bilangan fibonacci: ");
        for (int i = 0; i < angka; i++) {
            int hasil = fibonacciMain(i);
            System.out.print(hasil + " ");
        }
    }