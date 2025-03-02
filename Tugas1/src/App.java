import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        System.out.println("=== Pilih Opsi Login ===");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        
        System.out.print("Login Sebagai: ");
        String pilihan = scanner.nextLine().trim();
        if(pilihan.equalsIgnoreCase("Admin")||pilihan.equalsIgnoreCase("1")){
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            String password = scanner.nextLine();
            if(username.equals("admin353") && password.equals("password353")){
                System.out.println("Login Admin Berhasil");
            } else{
                System.out.println("Login Gagal! Username Atau Password Salah");
            }
        } else if (pilihan.equalsIgnoreCase("Mahasiswa")||pilihan.equalsIgnoreCase("2")){
            System.out.print("Nama: ");
            String name = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            if (name.equals("Halid Ahmad Baladraf") && nim.equals("202210370311353")) {
                System.out.println("Login Mahasiswa Berhasil");
            } else{
                System.out.println("Login gagal! Nama atau Nim Salah");
            }
            
        } else {
            System.out.println("Pilihan Tidak Valid");
            
        }

            scanner.close();
    }
}
