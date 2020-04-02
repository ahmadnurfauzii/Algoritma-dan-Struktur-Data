
public class DaftarBuku {
    Perpustakaan  listBuku[] = new Perpustakaan [4];
    int idx;
    
    void tambah(Perpustakaan  b){
        if(idx<listBuku.length){
            listBuku[idx] = b;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil(){
        for(Perpustakaan  b : listBuku){
            b.tampil();
            System.out.println();
        }
    }
    
    void bubbleSort(){
        for(int i=0; i<listBuku.length-1; i++){
            for (int j=1; j<listBuku.length-i; j++){
                if(listBuku[j].tinggiBuku > listBuku[j-1].tinggiBuku){
                    
                    Perpustakaan  tmp = listBuku[j];
                    listBuku[j] = listBuku[j-1];
                    listBuku[j-1] = tmp;
                }
            }
        }
    }
}
