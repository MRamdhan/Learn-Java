import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat datang di permainan Number Guess!");
        System.out.print("Masukkan batas maksimal angka yang ingin ditebak: ");
        int maxNumber = scanner.nextInt();

        int numberToGuess = random.nextInt(maxNumber) + 1; // Angka acak 1 hingga maxNumber
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Saya telah memilih angka antara 1 dan " + maxNumber + ".");
        System.out.println("Bisakah kamu menebaknya?");

        while (!guessedCorrectly) {
            System.out.print("Masukkan tebakanmu: ");
            int playerGuess = scanner.nextInt();
            attempts++;

            if (playerGuess < numberToGuess) {
                System.out.println("Tebakanmu terlalu rendah. Coba lagi!");
            } else if (playerGuess > numberToGuess) {
                System.out.println("Tebakanmu terlalu tinggi. Coba lagi!");
            } else {
                System.out.println("Selamat! Kamu berhasil menebak angka yang benar dalam " + attempts + " percobaan.");
                guessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
