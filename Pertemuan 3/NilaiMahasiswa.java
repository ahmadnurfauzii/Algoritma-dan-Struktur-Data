/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author ASUS
 */
public class NilaiMahasiswa {
    public String namaMahasiswa;
    public int nilaitugas, nilaikuis, nilaiUTS,  nilaiUAS;
    public int total, jumlah;

    public double hitungtotalnilai(int nt, int nk, int nu, int na){
        return ((nt * 30/100) + (nk * 20/100) + (nu * 20/100) + (na * 30/100));
    }
    
}
