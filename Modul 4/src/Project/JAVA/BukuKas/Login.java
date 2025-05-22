package Project.JAVA.BukuKas;
import java.util.Scanner;
public class Login extends Bukukas {
    public Login(String nama,String password){
        super(nama, password);
    }
    Scanner scan = new Scanner(System.in);
    @Override
    public boolean login() {
        while (true) {
            System.out.printf("===== Menu Login =====\n");
            System.out.printf("Masukkan Nama Anda:");
            nama = scan.nextLine();
            System.out.printf("Masukkan Password Anda:");
            password = scan.nextLine();

            if(nama.equalsIgnoreCase(namaDisimpan) && password.equalsIgnoreCase(passwordDisimpan)){
                System.out.printf("Selamat Anda Telah Berhasil Login!!!\n");
                return true;

            }else {
                System.out.printf("Anda Salah Memasukkan Username Atau Password!!!\n");
            }
        }
    }
}
