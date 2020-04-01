/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainTerbalik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner fn = new Scanner(System.in);
        
        System.out.print("Masukkan kalimat\t: ");
        String kalimat = fn.nextLine();
        String kata[] = kalimat.split("\\s+");
        Terbalik tumpukan = new Terbalik(kata.length);

        for(int i=0; i<kata.length; i++){
            tumpukan.push(kata[i]);
        }
        
        tumpukan.print();
    } 
}
