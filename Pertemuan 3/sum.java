/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

public class sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double [elemen];
        this.total = 0;
    }
    double totalBF(double arr []){
        for (int i = 0; i < elemen; i++){
            total = total + arr[i];
            
        }
        return total;
    }
    double totalDC(double arr[], int l, int r) {
    if (l==r){
        return arr[1];
    }
    else if(l<r){
        int mid = (l+r)/2;
        double lSUM=totalDC(arr, l, mid-1);
        double rSUM=totalDC(arr, mid + 1, r);
        return lSUM+rSUM+arr[mid];
    }
    return 0;
}
    
}
