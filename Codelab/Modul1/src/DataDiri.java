import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String nama;
        char jeniskelamin;
        int Tahunlahir;
        int tahunsekarang;
        int umur;

        Scanner objinput = new Scanner(System.in);

        System.out.print("Masukan Nama: ");
        nama = objinput.nextLine();


        System.out.print("Masukan Jenis kelamin (P/L): ");
        jeniskelamin = objinput.next().charAt(0);
        
        String jk;
        if(jeniskelamin == 'L') {
            jk = "laki - laki";
        } else if (jeniskelamin == 'P'){
            jk = "Perempuan";
        } else {
            jk = "Tidak diketahui";
        }


        System.out.print("Masukan tahun Lahir: ");
        Tahunlahir = objinput.nextInt();

        tahunsekarang  = LocalDate.now().getYear();
        umur = tahunsekarang - Tahunlahir;
        
        
        System.out.println("\n=== Data Diri Pengguna ===");
        System.out.println("nama : " + nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Umur : " + umur);
        
    }
}