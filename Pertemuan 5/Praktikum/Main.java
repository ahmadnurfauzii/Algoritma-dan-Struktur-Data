/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 3;
        for(int i=0; i<jumMhs;i++){
            System.out.println("Nama = ");
            String nama = s1.nextLine();
            System.out.println("Thn Masuk = ");
            int thn = s.nextInt();
            System.out.println("Umur = ");
            int umur = s.nextInt();
            System.out.println("IPK = ");
            double ipk = s.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama,thn,umur,ipk);
        }
        System.out.println("Data mahasiswa setelah sorting asd berdasar ipk= ");
         data.selectionsort();
        data.tampil();
}
    
}
