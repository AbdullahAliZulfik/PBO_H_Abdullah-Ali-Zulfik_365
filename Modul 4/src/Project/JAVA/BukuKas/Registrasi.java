package Project.JAVA.BukuKas;
import java.util.Scanner;
public class Registrasi extends Bukukas {
    public Registrasi(String namaDisimpan, String passwordDisimpan){
        super(namaDisimpan,passwordDisimpan);
    }
Scanner scan = new Scanner(System.in);
    @Override
    public void registrasi(){
        while(true) {
            System.out.printf("===== Menu Registrasi =====\n");
            System.out.printf("Masukkan Username Anda:");
            String inputNama = scan.nextLine();
            System.out.printf("Masukkan Password Anda:");
            String inputPassword = scan.nextLine();
            System.out.printf("Apakah Anda Yakin Dengan Username Dan Password Anda? Jawab (1) untuk setuju (2) untuk mengulang\n");
            int jawab = scan.nextInt();
            if(jawab == 1){
                System.out.printf("Selamat Anda Telah Berhasil Mendaftar Menjadi Anggota\n");
                break;

            }else{

            }
        }

    }

}
