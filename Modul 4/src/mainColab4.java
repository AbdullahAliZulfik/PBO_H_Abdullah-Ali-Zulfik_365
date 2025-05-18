import CodeLab4.Perpustakaan.*;

public class mainColab4 {
    public static void main(String[] args) {

        Fiksi fiksi1 = new Fiksi("Lord Of The Rings: The Fellow Ship Of The Ring","J. R. R. Tolkien","Fantasy,Slice Of Life");
        nonFiksi nonfiksi1 = new nonFiksi("Ihya ulumuddin","Imam Al-Ghazali","Teologi,Tasawuf");

        Anggota anggota1 = new Anggota("Abdullah Ali Zulfik","H365",7);
        Anggota anggota2 = new Anggota("Omeir","S017",10);

        Peminjaman anggotaa = new Anggota("Abdullah Ali Zulfik","H365", 7);
        Peminjaman anggotaaa = new Anggota("Omeir","S017",10);

        fiksi1.displayInfo();
        nonfiksi1.displayInfo();

        anggota1.setBukuDipinjam(fiksi1);
        anggota2.setBukuDipinjam(nonfiksi1);

        anggota1.tampilkanInfo();
        anggota2.tampilkanInfo();

       anggotaa.pinjamBuku(anggota1.getNama(), fiksi1);
       anggotaa.pinjamBuku(anggota1.getNama(), fiksi1, anggota1.getDurasi());

       anggotaaa.pinjamBuku(anggota2.getNama(), nonfiksi1);
       anggotaaa.pinjamBuku(anggota2.getNama(), nonfiksi1, anggota2.getDurasi());

       anggotaa.kembalikanBuku(anggota1.getNama(), fiksi1);
       anggotaaa.kembalikanBuku(anggota2.getNama(), nonfiksi1);
    }
}
