package CodeLab4.Perpustakaan;

public class nonFiksi extends Buku {
    public nonFiksi(String judul, String penulis, String topik){
        super(judul, penulis, topik);
    }

    @Override
    public void displayInfo(){
        System.out.println("Buku Non-Fiksi: " + getJudul() + " Oleh: " + getPenulis() + "Bidang: " +getTopik());
    }
}
