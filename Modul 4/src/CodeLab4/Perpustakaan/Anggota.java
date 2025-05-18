package CodeLab4.Perpustakaan;

public class Anggota implements Peminjaman {
    String nama;
    String idAnggota;
    int durasi;
    private Buku bukuDipinjam;

    public Anggota(String nama,String idAnggota,int durasi){
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.durasi = durasi;
    }
    public void setBukuDipinjam(Buku bukuDipinjam){
        this.bukuDipinjam = bukuDipinjam;
    }

    public void tampilkanInfo(){
        System.out.println("Anggota: " + nama + " ID: " +idAnggota);
    }

public String getNama(){
        return nama;
}

public String getIdAnggota(){
        return idAnggota;
}

public int getDurasi(){
        return durasi;
}



    @Override
    public void pinjamBuku(String nama,Buku bukuDipinjam){
        System.out.printf("%s Meminjam Buku Yang Berjudul: %s\n",nama, bukuDipinjam.getJudul());
    }

    @Override
    public void pinjamBuku(String nama, Buku bukuDipinjam,int durasi) {
        System.out.printf("%s Meminjam Buku Yang Berjudul: %s Selama: %d Hari\n",nama,bukuDipinjam.getJudul(),durasi);

    }
    @Override
    public void kembalikanBuku(String nama, Buku bukuDipinjam){
        System.out.printf("%s Mengembalikan Buku Yang Berjudul %s\n",nama,bukuDipinjam.getJudul());
    }
}
