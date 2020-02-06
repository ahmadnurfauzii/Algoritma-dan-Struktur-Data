import java.util.Scanner;

        
public class hitungluas {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        menu();
        
    }
    static void menu(){
        int menu;
        System.out.println("Menu");
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Segiempat");
        System.out.println("3. Luas Lingkaran");
        System.out.print("Masukan Menu : ");
        menu = sc.nextInt();
        switch(menu){
            case 1 :
                LuasSegitiga();
                break;
            case 2 :
                LuasSegiempat();
                break;
            case 3 : 
                LuasLingkaran();
                break;
            default :
                System.out.println("Menu yang anda pilih tidak ada!");
                
    }
    }
    static void LuasSegitiga(){
        double alas, tinggi, luas;
        System.out.print("Masukan panjang alas : ");
        alas = sc.nextLong();
        System.out.println("Masukan tinggi : ");
        tinggi = sc.nextLong();
        luas = 0.5 * alas * tinggi;
        System.out.println("Luas Segitiga : " + luas);
    }
    static void LuasSegiempat(){
        int sisi, luas;
        System.out.print("Masukan panjang sisi : ");
        sisi = sc.nextInt();
        luas = sisi * sisi;
        System.out.println("Luas Segiempat : " + luas);
}
    static void LuasLingkaran(){
        double jari2, luas;
        System.out.print("Masukan jari-jari : ");
        jari2 = sc.nextLong();
        luas = 3.14 * jari2 * jari2;
        System.out.println("Luas Lingkaran : " + luas);
}
}

