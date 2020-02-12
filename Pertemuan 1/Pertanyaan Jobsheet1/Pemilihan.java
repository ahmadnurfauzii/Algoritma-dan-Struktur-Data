import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner ujek = new Scanner(System.in);
        double tugas, uts, uas, nilaiAkhir, hitungTugas, hitungUts, hitungUas;
        System.out.print("Masukan nilai tugas anda : ");
        tugas = ujek.nextDouble();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Input yang anda masukan salah");
            tugas = 0;
        }
        System.out.print("Masukan nilai uts anda : ");
        uts = ujek.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("Input yang anda masukan salah");
            uts = 0;
        }
        System.out.print("Masukan nilai uas anda : ");
        uas = ujek.nextDouble();
        if (uas < 0 || uas > 100) {
            System.out.println("Input yang anda masukan salah");
            uas = 0;
        }

        hitungTugas = tugas * 20 / 100;
        hitungUts = uts * 35 / 100;
        hitungUas = uas * 45 / 100;
        nilaiAkhir = hitungTugas + hitungUas + hitungUts;
        System.out.println("20% nilai tugas = " + hitungTugas);
        System.out.println("35% nilai uts = " + hitungUts);
        System.out.println("45% nilai uas = " + hitungUas);
        System.out.println("nilai akhir anda = " + nilaiAkhir);
    }
 
}
