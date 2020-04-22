/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class Baju <T> {
    T noBaju, namaBaju, berat, jumlah;
    int beratBaju;
    Baju <T> next;

    public Baju(T noBrg, T namaBrg, T berat, T jumlah, Baju<T> next) {
        this.noBaju = noBrg;
        this.namaBaju = namaBrg;
        this.berat = berat;
        this.jumlah = jumlah;
        this.beratBaju = (int) berat * (int) jumlah;
        this.next = next;
    }
}
