
package tugas1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Nilaimahasiswa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program menghitung nilai Mahasiswa : ");
        System.out.print(" jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        
        NilaiMahasiswa[] nm = new NilaiMahasiswa[jumlah];
        
        for(int i=0; i<jumlah; i++){
            sc.nextLine();
            nm[i] = new NilaiMahasiswa();
            System.out.print("Mahasiswa Ke-" + (i+1) + " : ");
            nm[i].namaMahasiswa = sc.nextLine();
            System.out.print("Masukan nilai tugas: ");
            nm[i].nilaitugas = sc.nextInt();
            System.out.print("Masukan nilai kuis : ");
            nm[i].nilaikuis = sc.nextInt();
            System.out.print("Masukan nilai UTS");
            nm[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukan Nilai UAS");
            nm[i].nilaiUAS = sc.nextInt();
            
        }
    }
}
