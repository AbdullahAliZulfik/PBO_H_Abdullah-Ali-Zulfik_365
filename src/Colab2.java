class RekeningBank{
    String nomorRekening;
    String namaPemilik;
    double saldo;

    void tampilkanInfo(){
    System.out.println("Nomor Rekening: " + nomorRekening);
    System.out.println("Nama Pemilik: " + namaPemilik);
    System.out.printf("Saldo Rp %.1f\n",  saldo);
    System.out.println(); 
}
    void setorUang(double jumlah){
        System.out.printf(   "%s Menyetor Rp%.1f\n",namaPemilik,  jumlah);
        saldo += jumlah;
        System.out.printf("Saldo Sekarang Adalah:Rp%.1f\n ", saldo);

    }
    void tarikUang(double jumlah){
        System.out.printf( " %s menarik Rp%.1f\n",namaPemilik, jumlah);
        if(jumlah > saldo){
            System.out.printf("(Gagal,Saldo Tidak Mencukupi) Saldo Saat Ini Rp%.1f\n", saldo);
        }else{
            saldo -= jumlah;
            System.out.printf("(Berhasil,Saldo Sekarang: Rp%.1f\n)", saldo);
        }

    }
}

public class Colab2 {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.namaPemilik = "Abdullah Ali Zulfik";
        rekening1.nomorRekening = "202410370110365";
        rekening1.saldo = 800000;

        rekening2.namaPemilik = "Monkey D Luffy";
        rekening2.nomorRekening= "202410370110366";
        rekening2.saldo = 500000;

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        rekening1.setorUang(100000);
        rekening2.setorUang(200000);

        rekening1.tarikUang(350000);
        rekening2.tarikUang(800000);

        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
    
}
