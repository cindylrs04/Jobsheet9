import java.util.Scanner;
public class Tugas08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int banyak = sc.nextInt();
        int[] arraycnd = new int[banyak];
        double sum = 0, rata2;
        for (int i = 0; i < arraycnd.length; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
            arraycnd[i] = sc.nextInt();
        }
        int max = arraycnd[0], min = arraycnd[0];
        for (int i = 0; i < arraycnd.length; i++) {
            if (arraycnd[i] > max) {
                max = arraycnd[i];
            }
            if (arraycnd[i] < min) {
                min = arraycnd[i];
            }
            sum += arraycnd[i];
        }
        rata2 = sum / arraycnd.length;
        System.out.println("Rata-rata : " + rata2);
        System.out.println("Nilai tertinggi : " + max);
        System.out.println("Nilai terendah : " + min);
    }
    
}
