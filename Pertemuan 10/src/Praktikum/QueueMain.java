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
public class QueueMain {

    /**
     * @param args the command line arguments
     */
    public static void menu() {
    System.out.println("Masukan operasi yang diinginkan");
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Print");
    System.out.println("4. Peek");
    System.out.println("---------------------");
    }
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);    
    System.out.println("Msaukan jumlah maksumal antrian: ");
    int n = sc.nextInt();
    Queue Q = new Queue(n);
    int pilih;
    
    
    do {
        menu();
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("Masuka data baru: ");
                int dataMasuk = sc.nextInt();
                Q.Enqueue(dataMasuk);
                break;
            case 2:
                int dataKeluar = Q.Dequeue();
                if (dataKeluar !=0) {
                    System.out.println("Data yang Dikeluarkan: " + dataKeluar);
                    break;
                }
            case 3:
                Q.print();
                break;
            case 4:
                Q.peek();
                break;
            
        }
    } while (pilih == 1 || pilih == 2 || pilih ==3 || pilih == 4);
    }
}
