import java.util.Scanner;
public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyak;
        System.out.print("Masukkan jumlah mahasiswa : ");
        banyak = sc.nextInt();
        int[] nilaiMhs = new int[banyak];
        double jumlahLulus = 0, jumlahtidakLulus = 0, rataLulus, ratatidakLulus;
        int lulus = 0, tidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += 1;
                jumlahLulus += nilaiMhs[i];
            } else {
                tidakLulus += 1;
                jumlahtidakLulus += nilaiMhs[i];
            }
        } 
        rataLulus = jumlahLulus / lulus;
        ratatidakLulus = jumlahtidakLulus / tidakLulus;
        System.out.println("Rata-rata nilai = "+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = "+ ratatidakLulus);
    }
}
