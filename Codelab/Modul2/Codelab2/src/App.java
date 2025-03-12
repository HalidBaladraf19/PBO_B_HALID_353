public class App {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank("202210370311353", "Halid Baladraf", 500000);
        RekeningBank rekening2 = new RekeningBank("202210370311321", "Liedle Nursalil", 400000);
        
        System.out.println("Informasi Rekening 1:");
        rekening1.tampilkanInfo();
        System.out.println();
        
        System.out.println("Informasi Rekening 2:");
        rekening2.tampilkanInfo();
        System.out.println();
        
        rekening1.setorUang(200000);
        rekening2.tarikUang(100000);
    }
}