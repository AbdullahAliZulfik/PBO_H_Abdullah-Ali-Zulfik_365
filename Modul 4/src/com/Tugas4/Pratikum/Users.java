package com.Tugas4.Pratikum;
import java.util.Scanner;

public abstract class Users {

public Scanner scan = new Scanner(System.in);

    private String nama;
    private String nim;

    public Users(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public abstract boolean login();
    public void displayInfo(){
        System.out.println(("---Data Mahasiswa---"));
        System.out.println("Nama Anda Adalah: " + getNama());
        System.out.println("NIM Anda Adalah" + getNim());
    }

    public abstract void displayAppMenu();
}