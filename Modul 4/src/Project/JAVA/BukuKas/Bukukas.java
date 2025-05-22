package Project.JAVA.BukuKas;

public class Bukukas {
    String nama;
    String namaDisimpan;
    String password;
    String passwordDisimpan;
    String hari;
    String Bulan;
    String tahun;
    String namaBarang;
    int inputUang;
    int tarikUang;
    int jumlahUang;
    int hargaBarang;

    public Bukukas(String nama,String password){
        this.nama = nama;
        this.password = password;
    }

    public Bukukas(String hari, String bulan,String tahun){
        this.hari = hari;
        this.Bulan = bulan;
        this.tahun = tahun;
    }

    public Bukukas(int jumlahUang, int inputUang,String namaBarang, int hargaBarang, int tarikUang){
        this.jumlahUang = jumlahUang;
        this.inputUang = inputUang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }
    public Bukukas(String namaDisimpan, String passwordDisimpan){
        this.namaDisimpan = namaDisimpan;
        this.passwordDisimpan = passwordDisimpan;
    }






  public boolean login(){
        System.out.printf("Masukkan Nama Anda:");
        System.out.printf("Masukkan Password Anda:");
  }

  public void tanggal(){
        System.out.printf("Masukkan Hari,Bulan,Tahun");
  }

  public void jumlah(){
        System.out.printf("Jumlah Uang Anda Adalah:");
  }

  public void masukkanUang(){
        System.out.printf("Anda Memasukkan Uang Sebanyak:");

      }
  public void kurangUang(){
            System.out.printf("Nama Barang Yang Anda Beli:");
      }

      public void tampilanUtama(){
        System.out.printf("1.");
      }

      public void tampilanLogin(){

      }

      public void registrasi(){

      }

      public void masukkanUang(){

      }

      public void lihatJumlahUang(){

      }
      public void beliBarang(){

      }

  }

