import java.util.Scanner;
import java.util.Random;

public class BatuGuntingKertas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] pilihan = {"Batu", "Gunting", "Kertas"};

        System.out.println("=== Selamat Datang di Game Batu-Gunting-Kertas! ===");
        System.out.println("Cara bermain: Masukkan angka (0 untuk Batu, 1 untuk Gunting, 2 untuk Kertas)");

        while (true) {
            System.out.print("Pilihan Anda (0 = Batu, 1 = Gunting, 2 = Kertas, 9 = Keluar): ");
            int pilihanPengguna = scanner.nextInt();

            if (pilihanPengguna == 9) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            if (pilihanPengguna < 0 || pilihanPengguna > 2) {
                System.out.println("Pilihan tidak valid. Coba lagi");
                continue;
            }

            int pilihanKomputer = random.nextInt(3);

            System.out.println("Anda memilih: " + pilihan[pilihanPengguna]);
            System.out.println("Komputer memilih: " + pilihan[pilihanKomputer]);

            if (pilihanPengguna == pilihanKomputer) {
                System.out.println("Hasil: Seri!");
            } else if ((pilihanPengguna == 0 && pilihanKomputer == 1) ||
                        (pilihanPengguna == 1 && pilihanKomputer == 2) ||
                        (pilihanPengguna == 2 && pilihanKomputer == 0)) {
                System.out.println("Hasil: Anda Menang");
            } else {
                System.out.println("Hasil: Komputer Menang");
            }
        }

        scanner.close();
    }
}
