package modul5.modul5.codeLab;

public class barang {
    private String nama;
    private int stok;
    public barang(String nama, int stok){
        this.nama = nama;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getStok(){
        return stok;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
}

