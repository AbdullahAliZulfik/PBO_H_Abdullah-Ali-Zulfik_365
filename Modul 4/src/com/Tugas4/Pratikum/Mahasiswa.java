package com.Tugas4.Pratikum;

import com.Com.Tugas4.MahasiswaAksi;

public class Mahasiswa extends Users implements MahasiswaAksi {
    public Mahasiswa(String nama, String nim){
        super(nama, nim);

    }

    @Override
    public boolean login() {
        System.out.println("Masukkan Nama Anda Untuk Login:");
        String inputNama = scan.nextLine();
        System.out.println("Masukkan Nim Anda Untuk Login:");
        String inputNim = scan.nextLine();

        if (inputNama.equalsIgnoreCase(getNama()) && inputNim.equalsIgnoreCase(getNim())){
            System.out.println("Selamat Anda Berhasil Login");

                 return true;

        }else{
            System.out.println("Anda Telah Gagal Login! Nama Atau Password Salah!");
            return false;
        }
    }


    public void displayInfo(){

    }
@Override
    public void infoItem(){
        while(true){


        System.out.println("Lain Kali Perhatikan Barang Anda!!!");
        System.out.println("Nama Barang Anda:");
        String namaBenda = scan.nextLine();

        System.out.println("Deskripsi Barang Anda:");
        String deskripsiBenda = scan.nextLine();

        System.out.println("Lokasi Terakhir:");
        String lokasiTerakhir = scan.nextLine();
        System.out.println("Apakah Udah Bener yang Anda Isi?(ketik 1 untuk bener 2 untuk tidak):");
                int konfirmasi = scan.nextInt();
        if(konfirmasi == 1){
            break;
        }else {
            System.out.println("Tulis Yang Bener!!!");
        }


            }

    }
    @Override
    public void laporanItem(){
        System.out.println("Maaf Fitur Ini Belum Tersedia Heheehehe");
    }

    @Override
    public void displayAppMenu() {
        while (true) {
            System.out.println("---Menu---");
            System.out.println("0.Logout");
            System.out.println("1.Laporkan Barang Temuan/Hilang Asal Jangan Curian!!!!");
            System.out.println("2.Lihat Barang Yang Dilaporkan!!!");
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    infoItem();
                    break;
                case 2:
                    laporanItem();
                    break;
                case 0:
                    return;
                default:
                    return;
            }
        }
    }


}
