public class Operators {
    public static void main(String[] args) {
        // Kode dari soal
        double x = 92.98;
        int nx = (int) Math.round(x);
        
        System.out.println("Nilai x = " + x);
        System.out.println("Hasil Math.round(x) = " + Math.round(x));
        System.out.println("Nilai nx = " + nx);
        
        System.out.println("\n=== TESTING LEBIH BANYAK ===");
        double[] testNumbers = {92.98, 92.49, 92.50, 92.51};
        
        for (int i = 0; i < testNumbers.length; i++) {
            double angka = testNumbers[i];
            long hasilRound = Math.round(angka);
            int hasilCast = (int) Math.round(angka);
            System.out.println("Angka: " + angka + " -> Math.round: " + hasilRound + " -> setelah cast ke int: " + hasilCast);
        }
        
        System.out.println("\n=== PENJELASAN SEDERHANA ===");
        System.out.println("Math.round() menghasilkan tipe LONG, bukan INT");
        System.out.println("Makanya perlu cast (int) untuk masukkan ke variabel int");
    }
}