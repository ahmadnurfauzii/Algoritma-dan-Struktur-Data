/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author ASUS
 */
public class DaftarMahasiswaBerprestasi {
    Mahasiswa listmhs[] = new Mahasiswa[5];
    int idx;
    
    
    
    void tambah(Mahasiswa m){
        if(idx<listmhs.length){
            listmhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh!!");
        }
    }
    
    void tampil(){
        for(Mahasiswa m : listmhs){
            m.tampil();
            System.out.println("--------------------------------");
        }
    }
    void bubblesort(){
        for(int i=0; i<listmhs.length-1; i++){
            for(int j=1; j<listmhs.length-i; j++){
                if(listmhs[j].ipk > listmhs[j-1].ipk){
                    
                    Mahasiswa tmp = listmhs[j];
                    listmhs[j] = listmhs[j-1];
                    listmhs[j-1] = tmp;
                    
                }
            }
        }
    }
        void selectionsort(){
        for(int i=0; i<listmhs.length-1; i++){
            int idxMin = i;
            for(int j=i+1; j<listmhs.length; j++){
                if(listmhs[j].ipk < listmhs[idxMin].ipk){
                    idxMin = j;
}
                }
            Mahasiswa tmp = listmhs[idxMin];
            listmhs[idxMin] = listmhs[i];
            listmhs[i] = tmp;
        }
            }
         void insertionsort(){
            int i, j;
            for (i = 1; i < listmhs.length; i++){
                Mahasiswa temp = new Mahasiswa();
                temp = listmhs[i];
                j = i;
                while (( j > 0) && (listmhs[j - 1].ipk > temp.ipk)){
        }
            }
         }
}


