import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int angkaTebakan = random.nextInt(100) + 1;
        int tebakanPemain = 0;
        int jumlahTebakan = 0;

        System.out.println("=== Selamat Datang di Game Tebak Angka ===");
        System.out.println("P : Saya telah memilih sebuah angka antara 1 hingga 100.");
        System.out.println("P : Coba tebak angka tersebut!");

        while (tebakanPemain != angkaTebakan) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakanPemain = scanner.nextInt();
            jumlahTebakan++;

            if (tebakanPemain < angkaTebakan) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else if (tebakanPemain > angkaTebakan) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else {
                System.out.println("Selamat! Anda berhasil menebak angka.");
                System.out.println("Angka yang saya pilih adalah: " + angkaTebakan);
                System.out.println("Anda menebak dalam " + jumlahTebakan + " percobaan.");
            }
        }

        System.out.println("Terima kasih telah bermain!");
        scanner.close();
    }
}
