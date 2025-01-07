public class CaesarCipher {
    public static void main(String[] args) {
        String teksAsli = "HALO";
        int geser = 3;
        String terenkripsi = encrypt(teksAsli, geser);
        String terdekripsi = encrypt(terenkripsi, -geser);

        System.out.println("Teks asli: " + teksAsli);
        System.out.println("Teks terenkripsi: " + terenkripsi);
        System.out.println("Teks terdekripsi: " + terdekripsi);
    }

    public static String encrypt(String teks, int geser) {
        StringBuilder hasil = new StringBuilder();
        for (char huruf : teks.toCharArray()) {
            char hurufBaru = (char) (huruf + geser);
            if (hurufBaru > 'Z') hurufBaru -= 26; 
            hasil.append(hurufBaru);
        }
        return hasil.toString();
    }
}
