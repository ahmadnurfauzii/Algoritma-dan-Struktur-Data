package minggu4;

/**
 *
 * @author FauzanOIOI
 */
public class fibonacci {
    static int fibo(int angka) {
        if (angka == 0 || angka == 1) {
            return angka;
        }
        else {
            return (fibo(angka - 1) + fibo(angka - 2));
        }
    }
}

  
