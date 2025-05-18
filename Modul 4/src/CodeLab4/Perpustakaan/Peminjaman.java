package CodeLab4.Perpustakaan;

public interface Peminjaman {

    void pinjamBuku(String nama,Buku bukuDipinjam);
    void pinjamBuku(String nama, Buku bukuDipinjam,int durasi);

    void kembalikanBuku(String nama, Buku bukuDipinjam);
}
