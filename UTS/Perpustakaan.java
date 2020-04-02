/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Perpustakaan {
    String judul;
    int jumlahHalaman;
    double tinggiBuku;
    
    Perpustakaan (String j, int jml, double tg){
        judul = j;
        jumlahHalaman = jml;
        tinggiBuku = tg;
    }
    void tampil(){
        System.out.println("judul = "+judul);
        System.out.println("Jumlah Halaman = "+jumlahHalaman);
        System.out.println("Tinggi Buku = "+tinggiBuku);
    }
}
