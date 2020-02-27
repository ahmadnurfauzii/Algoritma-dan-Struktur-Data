
package tugas1;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String namaMahasiswa;
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double total;
        
        
        System.out.println("Masukkan Nama: ");
        namaMahasiswa = sc.nextLine();
        System.out.println("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.println("Masukkan nilai kuis: " );
        nilaiKuis = sc.nextInt();
        System.out.println("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.println("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();
        
        total = (nilaiTugas*0.30) + (nilaiKuis*0.20) + (nilaiUTS*0.20) + (nilaiUAS*0.30);
            
        System.out.println("hasil akhir adalah: " + total);
    }
}
