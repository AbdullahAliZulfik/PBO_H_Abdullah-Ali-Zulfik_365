package Project.JAVA.BukuKas;
import  java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bukukas> buku = new ArrayList<>();
        Bukukas menu = new menuLogin();

        menu.tampilanLogin();
        int input1 = scan.nextInt();
        switch (input1) {
            case 1:
                menu.login();
                menu.tampilanUtama();
                int input2 = scan.nextInt();
                switch (input2) {
                    case 1:
                        menu.masukkanUang();
                    case 2:
                        menu.beliBarang();
                    case 3:
                        System.out.println("Jumlah Uang Anda Adalah: " + menu.jumlahUang);
                    case 4:
                        break;
                    default:
                        break;


                }

            case 2:
                menu.registrasi();

            case 3:
                return;
            default:
                return;

        }
    }
}
