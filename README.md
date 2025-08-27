# W1_PBO_Praktek

Nama: Ibnu Hilmi Athaillah
NIM: 241511079
Kelas: D3 Teknik Informatika 2A
Mata Kuliah: Pemrograman Berbasis Objek (Praktek)
Dosen: Zulkifli Arsyad, Ardhian Ekawijana
Deskripsi
Repository ini berisi solusi untuk 5 soal praktikum pertama mata kuliah PBO yang mencakup fundamental programming structures dalam Java. Setiap soal dirancang untuk memahami konsep dasar seperti tipe data, variables, operators, dan strings.
Environment Setup

JDK Version: Java Development Kit 24
IDE: Visual Studio Code dengan extension Java
OS: Windows
Tools: Command Prompt, Git

Soal dan Solusi

- Setup Software Environment
- Using Command Line Tools
- Analisis Output Program
- Using an Integrated Development Environment (IDE)

Soal 1: Data Types
Topik: Primitive data types (byte, short, int, long)
Tujuan: Menentukan tipe data primitif yang dapat menyimpan nilai input tertentu
File: Soal1_DataTypes.java
Konsep yang dipelajari:

Range nilai setiap tipe data primitif
Handling input yang melebihi kapasitas long menggunakan String parsing
Exception handling dengan try-catch

Soal 2: Variables
Topik: Konstanta dengan final dan public static final
Tujuan: Memahami perbedaan scope dan aksesibilitas variabel konstanta
File: Soal2_Constants.java, Soal2_Constants2.java
Konsep yang dipelajari:

Local variable vs class variable
Memory allocation untuk konstanta
Accessibility dari luar class

Soal 3: Operators
Topik: Math class dan type casting
Tujuan: Memahami penggunaan Math.round() dan casting
File: Soal3_Operators.java
Konsep yang dipelajari:

Return type dari Math.round() adalah long
Necessity of explicit casting dari long ke int
Pembulatan angka desimal

Soal 4: Operators (1)
Topik: Multiple type casting
Tujuan: Melacak perubahan data melalui multiple casting
File: Soal4_Operators_1.java
Konsep yang dipelajari:

Data loss saat casting dari floating point ke integer
Chain of casting: double → float → long → int → short → byte
Debugging complex type conversions

Soal 5: Strings
Topik: String operations
Tujuan: Operasi dasar pada String (length, comparison, capitalization)
File: Soal5_Strings.java
Konsep yang dipelajari:

String.length() untuk menghitung karakter
Lexicographic comparison dengan compareTo()
String manipulation dengan substring() dan toUpperCase()

Cara Menjalankan
Menggunakan Command Line:
bash# Compile
javac NamaFile.java

# Run  
java NamaClass
Menggunakan IDE:

Buka file Java di VS Code
Klik tombol Run atau gunakan Ctrl+F5
Output akan tampil di terminal integrated

Permasalahan yang Dihadapi
Technical Issues:

Compile error saat menggunakan angka besar langsung dalam array long
Type mismatch error antara long dan int dalam Math.round()
Confusion dengan multiple casting chains

Learning Challenges:

Memahami konsep lexicographic comparison
Debugging step-by-step dalam multiple type conversion
Understanding scope differences antara local dan class variables

Solusi dan Learning Points
Problem Solving Approach:

Menggunakan String parsing untuk handle angka besar
Implementasi step-by-step debugging dengan output detail
Testing dengan multiple test cases untuk validasi konsep

Key Takeaways:

Java strict typing system requires explicit casting
Data loss dapat terjadi dalam type conversion
Exception handling penting untuk robust program
Documentation dan testing membantu debugging

Hasil dan Output
Semua program berhasil dijalankan sesuai expected output dari soal. Detail hasil dan screenshot tersedia dalam laporan praktikum di folder docs/.
Resources dan Referensi

Oracle Java Documentation untuk primitive data types
Java String API documentation
Stack Overflow untuk troubleshooting specific issues
Course materials dan praktikum guidelines


Note: Repository ini dibuat untuk keperluan akademik praktikum PBO di Politeknik Negeri Bandung. Kode dapat digunakan sebagai referensi pembelajaran dengan tetap menjaga integritas akademik.
