import java.util.Scanner;
import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nama Anda: ");
        String name = scanner.nextLine();

        System.out.print("Masukan Jenis Kelamin (P/L): ");
        char jk = scanner.next().charAt(0);
        String JenisKelamin;
        if (jk == 'P'){
            JenisKelamin = "Perempuan";
        } else if (jk == 'L') {
            JenisKelamin = "Laki Laki";
        } else {
            JenisKelamin = "Tidak diketahui";
        }

        System.out.print("Masukan Tahun Lahir: ");
        int Year = scanner.nextInt();

        int Tahun = LocalDate.now().getYear();

        int Age = Tahun - Year;

        System.out.println("=== Data Diri Pengguna ===");

        System.out.println("Nama: " + name);
        System.out.println("Jenis Kelamin: " + JenisKelamin);
        System.out.println("usia " + Age);


        scanner.close();
    }
}