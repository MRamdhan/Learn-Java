import java.util.Scanner;
import java.util.Random;

public class TebakKata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] daftarKata = {"program", "java", "teknologi", "komputer", "internet"};
        String kataPilihan = daftarKata[random.nextInt(daftarKata.length)];
        char[] progress = new char[kataPilihan.length()];
        for (int i = 0; i < progress.length; i++) {
            progress[i] = '_';
        }

        int kesempatan = 6;
        boolean menang = false;

        System.out.println("=== Selamat Datang di Game Tebak Kata! ===");
        System.out.println("Saya telah memilih sebuah kata.");
        System.out.println("Anda harus menebaknya huruf demi huruf.");
        
        while (kesempatan > 0 && !menang) {
            System.out.println("\nKata: " + String.valueOf(progress));
            System.out.println("Kesempatan tersisa: " + kesempatan);
            System.out.print("Masukkan huruf: ");
            char tebakan = scanner.next().charAt(0);

            boolean adaHuruf = false;
            for (int i = 0; i < kataPilihan.length(); i++) {
                if (kataPilihan.charAt(i) == tebakan && progress[i] == '_') {
                    progress[i] = tebakan;
                    adaHuruf = true;
                }
            }

            if (!adaHuruf) {
                kesempatan--;
                System.out.println("Huruf tidak ditemukan.");
            }

            if (String.valueOf(progress).equals(kataPilihan)) {
                menang = true;
            }
        }

        if (menang) {
            System.out.println("\nSelamat! Anda berhasil menebak kata: " + kataPilihan);
        } else {
            System.out.println("\nKesempatan habis. Kata yang benar adalah: " + kataPilihan);
        }

        scanner.close();
    }
}
