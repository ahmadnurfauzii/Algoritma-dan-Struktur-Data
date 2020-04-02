
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);
        DaftarBuku data = new DaftarBuku();
        
        int jumBuku = 4;
        for(int i=0; i<jumBuku; i++){
            System.out.print("Judul = ");
            String judul = s1.nextLine();
            System.out.print("Jumlah Halaman = ");
            int jum = sc.nextInt();
            System.out.print("Tinggi Buku = ");
            double tinggi = sc.nextDouble();
            System.out.println();
            
            Perpustakaan b = new Perpustakaan(judul, jum, tinggi);
            data.tambah(b);
        }
        System.out.println("Data Mahasiswa sebelum Sorting");
        data.tampil();
        System.out.println();
        
        System.out.println("Data Mahasiswa setelah sorting");
        data.bubbleSort();
        data.tampil();
    }
}
