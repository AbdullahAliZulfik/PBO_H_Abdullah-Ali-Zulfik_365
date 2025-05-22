package Project.JAVA.BukuKas;
import java.util.Scanner;
public class menuLogin extends Bukukas {
    public menuLogin(String namaDisimpan, String passwordDisimpan){
        super(namaDisimpan,passwordDisimpan);
    }

    @Override
    void tampilanLogin(){
        System.out.printf("===== Program Buku Kas =====\n");
        System.out.printf("1. Login\n");
        System.out.printf("2. Registrasi\n");
        System.out.printf("3. Keluar\n");

    }

}
