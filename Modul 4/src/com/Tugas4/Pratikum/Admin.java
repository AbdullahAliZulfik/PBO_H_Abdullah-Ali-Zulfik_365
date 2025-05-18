package com.Tugas4.Pratikum;

import com.Com.Tugas4.AdminAksi;

public class Admin extends Users implements AdminAksi {
    public String username;
    public String password;


    public Admin(String username, String password,String nama, String nim) {
    super(nama, nim);
        this.username = username;
        this.password = password;
    }
    @Override
public boolean login(){
    System.out.println("Masukkan Username Anda");
    String inputUsername = scan.nextLine();

    System.out.println("Masukkan Password Anda");
    String inputPassword = scan.nextLine();

if(inputUsername.equalsIgnoreCase(username) && inputPassword.equalsIgnoreCase(password)){
    System.out.println(username + " Telah Berhasil Login!");
    return true;
}else {
    System.out.println("Username Atau Password Salah! Anda Gagal Login");
    return  false;
}

    }


public void manageItems(){
    System.out.printf("Selamat Fitur Ini Belum Tersedia\n");
}

public void manageUsers(){
    System.out.printf("Selamat Maaf Fitur Ini Juga Belum Tersedia");
}

    @Override
    public void displayAppMenu() {
        while (true) {
            System.out.println("---Menu---");
            System.out.println("0.Logout");
            System.out.println("1.Kelola Laporan Barang");
            System.out.println("2.Kelola Data Mahasiswa");
            System.out.printf("Ayo Pilih:");
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    manageItems();
                    break;
                case 2:
                    manageUsers();
                    break;
                case 0:
                    return;

                default:
                    return;

            }

        }
    }
}