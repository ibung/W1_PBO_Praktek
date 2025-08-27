public class datatypes {
    public static void main(String[] args) {
        // Test dengan angka-angka dari soal
        long[] testNumbers = {-150, 150000, 1500000000, -100000000000000L};
        
        for (int i = 0; i < testNumbers.length; i++) {
            long number = testNumbers[i];
            System.out.println(number + " can be fitted in:");
            
            // Cek apakah bisa masuk ke byte (-128 sampai 127)
            if (number >= -128 && number <= 127) {
                System.out.println("* byte");
            }
            
            // Cek apakah bisa masuk ke short (-32768 sampai 32767)  
            if (number >= -32768 && number <= 32767) {
                System.out.println("* short");
            }
            
            // Cek apakah bisa masuk ke int (-2147483648 sampai 2147483647)
            if (number >= -2147483648 && number <= 2147483647) {
                System.out.println("* int");
            }
            
            // long pasti bisa karena kita pakai tipe long
            System.out.println("* long");
            
            System.out.println(); // baris kosong
        }
        
        // Test untuk angka yang terlalu besar (tidak masuk ke semua tipe)
        System.out.println("213333333333333333333333333333333333 can't be fitted anywhere.");
    }
}