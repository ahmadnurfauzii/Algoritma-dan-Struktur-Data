/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class minMaxMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        minMax[] ppArray = new minMax[5]; //0(1)
        ppArray [0] = new minMax(); //0(1)
        
        int min=ppArray[0].nilaiArray; //0(1)
        int max=ppArray[0].nilaiArray; //0(1)
        
        Scanner sc = new Scanner (System.in);
        
        for(int i=0; i<5; i++){ //log(n)
            ppArray[i] = new minMax();//0(1)
            System.out.println("Nilai array indeks ke-"+i);//0(1)
            System.out.println("Masukan nilai: ");//0(1)
            ppArray[i].nilaiArray = sc.nextInt();//0(1)
        }
        for (int i = 0; i < 5; i++){  //log(n)
            if (ppArray[i].nilaiArray<min)// 0(1)
                    min=ppArray[i].nilaiArray;// 0(1)
        else if(ppArray[i].nilaiArray>max)// 0(1)
            max=ppArray[i].nilaiArray;// 0(1)
    }
    System.out.println("Brute Force"); // 0(1)
    System.out.println("Nilai Minimal : " + min); // 0(1)
    System.out.println("Nilai Maksimal : " + max); // 0(1)
}
}