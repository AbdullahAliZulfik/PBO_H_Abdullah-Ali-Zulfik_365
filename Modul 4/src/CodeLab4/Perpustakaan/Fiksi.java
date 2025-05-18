package CodeLab4.Perpustakaan;

public class Fiksi extends Buku {
    public Fiksi (String judul, String penulis, String topik){
        super(judul, penulis,topik);
    }
    @Override
    public void displayInfo(){
        System.out.println("Buku Fiksi: " +getJudul() + " Oleh: " + getPenulis() + "Genre: " + getTopik());
    }

}
