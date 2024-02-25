import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.println("Masukkan data diri:");
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Jenis Kelamin (P/L): ");
        char jenisKelamin = Character.toUpperCase(scanner.nextLine().charAt(0)); // Ubah ke huruf besar
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirStr = scanner.nextLine();

        // Menghitung umur
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);
        LocalDate tanggalSekarang = LocalDate.now();
        int umur = Period.between(tanggalLahir, tanggalSekarang).getYears();

        // Menampilkan hasil
        String jenisKelaminStr = (jenisKelamin == 'P') ? "Perempuan" : "Laki-laki";
        System.out.println("\nData diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}