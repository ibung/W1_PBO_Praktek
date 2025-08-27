public class Strings {
    public static void main(String[] args) {
        // Test dengan contoh dari soal
        String A = "hello";
        String B = "java";
        
        System.out.println("=== HASIL UNTUK: " + A + " dan " + B + " ===");
        processStrings(A, B);
        
        System.out.println("\n=== TESTING DENGAN STRING LAIN ===");
        processStrings("apple", "banana");
        processStrings("zebra", "ant");
        processStrings("cat", "dog");
        
        System.out.println("\n=== PENJELASAN SEDERHANA ===");
        System.out.println("1. Panjang string = jumlah huruf");
        System.out.println("2. Leksikografis = urutan seperti di kamus");
        System.out.println("3. Kapitalisasi = huruf pertama jadi besar");
    }
    
    static void processStrings(String A, String B) {
        // 1. Jumlahkan panjang A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        
        // 2. Bandingkan leksikografis (urutan kamus)
        // compareTo() return: 
        // - angka negatif jika A < B
        // - 0 jika A = B  
        // - angka positif jika A > B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        // 3. Kapitalisasi huruf pertama
        // Cara sederhana: ambil huruf pertama, jadikan besar, gabung dengan sisanya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
        System.out.println("---");
    }
}