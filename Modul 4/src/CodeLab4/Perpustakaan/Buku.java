package CodeLab4.Perpustakaan;

public abstract class Buku {
   private String judul;
   private String penulis;
   private String topik;

   public Buku(String judul,String penulis,String topik){
       this.judul = judul;
       this.penulis = penulis;
       this.topik = topik;

   }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul){
       this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getTopik(){
       return  topik;
    }

    public void setTopik(String topik){
       this.topik = topik;
    }

    public abstract void displayInfo();



}
