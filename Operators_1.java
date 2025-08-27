class Operators_1{
    static short methodOne(long l) {
        int i = (int) l;
        return (short)i;
    }
    
    public static void main(String[] args) {
        // Kode dari soal
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
        
        // Testing step by step untuk jawab pertanyaan
        System.out.println("\n=== STEP BY STEP CONVERSION ===");
        System.out.println("1. double d = " + d);
        System.out.println("2. float f = (float) d = " + f);
        System.out.println("3. long untuk methodOne = (long) f = " + (long) f);
        System.out.println("4. int i dalam methodOne = (int) l = " + (int)(long) f);
        System.out.println("5. short dari methodOne = (short) i = " + methodOne((long) f));
        System.out.println("6. byte b = (byte) methodOne = " + b);
        
        System.out.println("\n=== PENJELASAN PERUBAHAN ===");
        System.out.println("d (double) = " + d + " -> b (byte) = " + b);
        System.out.println("Yang hilang: angka desimal (0.25)");
        System.out.println("Yang tersisa: angka bulat (10)");
        
        System.out.println("\n=== TESTING DENGAN ANGKA LAIN ===");
        testConversion(15.75);
        testConversion(200.99);
        testConversion(300.50);
    }
    
    // Method untuk testing dengan angka lain
    static void testConversion(double testD) {
        float testF = (float) testD;
        byte testB = (byte) methodOne((long) testF);
        System.out.println("double " + testD + " -> byte " + testB);
    }
}