import java.util.Scanner;
public class LinearSearch08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array : ");
        int banyak = sc.nextInt();
        int[] arrayInt = new int[banyak];
        int hasil = 0;

        for (int i = 0; i < banyak; i++) {
           System.out.print("Masukkan elemen array ke-" + i + " : ");
           arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukkan key yang ingin dicari : ");
        int key =sc.nextInt();
        for (int i = 0; i < banyak; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil); 
                break;               
            } else {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
        
        } 
    }    

