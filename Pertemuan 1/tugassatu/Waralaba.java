import java.util.Scanner;
public class Waralaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int harga=0, jum=0, hargatotal=0;
        String ulang = "Ya";
        while (ulang.equalsIgnoreCase("Ya")) {
        System.out.println("1. Paket Chicken");
        System.out.println("2. Paket Oke");
        System.out.print("Silahkan Pilih Paket: " );
        int paket = sc.nextInt();
        System.out.println();
        switch (paket) {
            case 1:
                System.out.println("1. ayam A (Rp. 12.000)");
                System.out.println("2. ayam B (Rp. 15.000)");
                System.out.println("3. ayam c (Rp. 20.000)");
                System.out.println();
                System.out.print("Silahkan Pilih : ");
                int pil1 = sc.nextInt();
            switch (pil1) {
                case 1:
                    harga = 12000;
                    break;
                case 2:
                    harga = 15000;
                    break;
                case 3:
                    harga = 20000;
                    break;
                default:
                    System.out.println("Masukkan Menu");
                    break;
            }
                break;
            case 2:
                System.out.println("1. Ok A (Rp. 10.000)");
                System.out.println("2. Ok B (Rp. 12.000)");
                System.out.println("3. Ok c (Rp. 15.000)");
                System.out.println();
                System.out.print("Silahkan Pilih : ");
                int pil2 = sc.nextInt();
                switch (pil2) {
                case 1:
                    harga = 10000;
                    break;
                case 2:
                    harga = 12000;
                    break;
                case 3:
                    harga = 15000;
                    break;
                default:
                    System.out.println("Masukkan Menu");
                break;
        }
                break;
            default:
                System.out.println("Menu Salah");
                break;
        }
            System.out.print("Berapa Banyak? ");
            jum = sc.nextInt();
        System.out.print("> Apakah Anda Ingin Pesan lagi? (Ya/Tidak) : ");
        ulang = sc.next();
        hargatotal += harga*jum;
    }
        System.out.println("Total :Rp. "+hargatotal);
}
}


