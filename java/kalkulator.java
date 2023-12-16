import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char lanjut = 'y'; 

        while (lanjut == 'y' || lanjut == 'Y') {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            System.out.println("Pilih operasi matematika (+, -, *, /): ");
            char operator = input.next().charAt(0);

            double hasil = 0;

            if (operator == '+') {
                hasil = angka1 + angka2;
            } else if (operator == '-') {
                hasil = angka1 - angka2;
            } else if (operator == '*') {
                hasil = angka1 * angka2;
            } else if (operator == '/') {
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak bisa melakukan pembagian dengan nol.");
                    continue; 
                }
            } else {
                System.out.println("Operasi tidak valid");
                continue; 
            }

            System.out.println("Hasil: " + hasil);
            System.out.println("Apakah Anda ingin menghitung lagi? (y/n): ");
            lanjut = input.next().charAt(0);
            
        }
        System.out.println("Terima Kasih");
        System.out.println("Sabdha Putra Laudri");
        input.close(); 
    
    }
}