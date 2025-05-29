package com.Tugas4.Pratikum;

public class item {
   private String namaItem;
   private String deskripsi;
   private String lokasi;
   private String status;

   public item(String namaItem,String deskripsi,String lokasi,String status){
       this.namaItem = namaItem;
       this.deskripsi = deskripsi;
       this.lokasi = lokasi;
       this.status = status;
   }

    public String getNamaItem() {
        return namaItem;
    }

    public void setNamaItem(String namaItem) {
        this.namaItem = namaItem;
    }

    public String getDeskripsi(){
       return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
