class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: " + saldo);
    }

    void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor " + jumlah + ". Saldo sekarang " + saldo);
    }

    void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo tidak cukup untuk melakukan penarikan.");
        } else {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik " + jumlah + ". Saldo sekarang " + saldo);
        }
    }
}


