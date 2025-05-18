package com.Com.Main.Pratikum;
import java.util.Scanner;
import com.Tugas4.Pratikum.*;

public class Main {
    public static void main(String[] args) {
Scanner pindai = new Scanner(System.in);

System.out.println("Selamat datang");
System.out.println("Kamu Siapa?");
System.out.println("1. Admin");
System.out.println("2. Mahasiswa");
System.out.printf("Yang Lo Pilih Apa?:");
        int pilihan = pindai.nextInt();

Users user = null;

if(pilihan == 1){
    user = new Admin("Solaire Of Astora","12345","Admin1","1");

} else if (pilihan == 2) {
    user = new Mahasiswa("Abdullah Ali Zulfik","202410370110365");

}else{
    System.out.println("Pilihan Lo Salah Maka Program Berhenti");
    return;
}

if(user.login()){
    user.displayAppMenu();
}else {
    System.out.println("Login Gagal. Program Berhenti");
}
    }
}