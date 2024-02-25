import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class DataDiri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelamin = input.nextLine();

        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String tanggalLahirStr = input.nextLine();

        // Parsing tanggal lahir menjadi objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Menghitung umur berdasarkan tahun sekarang
        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(tanggalLahir, sekarang);

        // Menampilkan hasil
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan"));
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur.getYears() + " tahun");
    }
}

