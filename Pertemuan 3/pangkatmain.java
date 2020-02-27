/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;
public class pangkatmain {
   public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("=================");
    System.out.print("Masukkan Jumlah elemen Yang Ingin Dihitung : ");
int elemen = sc.nextInt();
    
pangkat [] Png = new pangkat[elemen];
for (int i = 0; i < elemen; i++){
    Png[i] = new pangkat();
    System.out.print("Masukkan nilai yang dipangkatkan ke - " + (i+1) + " : ");
    Png[i].nilai = sc.nextInt();
    System.out.print("Masukkan nilai pemangkat ke - " + (i+1) + " : ");
    Png[i].pangkat = sc.nextInt();
}
       System.out.println("=======================================");
       System.out.println("Hasil Pangkat dengan brute force");
       for (int i = 0; i < elemen; i++){
           System.out.println("Nilai " +Png[i].nilai+ " Pangkat " + Png[i].pangkat + " adalah : " + Png[i].pangkatBF(Png[i].nilai, Png[i].pangkat));
       }
       System.out.println("==============================================");
       System.out.println("Hasil pangkat dengan divide and conquer");
       for (int i = 0; i < elemen; i++){
           System.out.println(" nilai " + Png[i].nilai + " pangkat " + Png[i].pangkat + " adalah : " + Png[i].pangkatDC(Png[i].nilai, Png[i].pangkat));
       }
       System.out.println("======================================================");
}
}
