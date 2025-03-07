import java.util.Scanner;
/* API */
public class Tugas1 {
    public static void main(String[] args) {
        /* Method */
        Scanner deteksi = new Scanner(System.in);
        int pilihan;
        String userAd,userP,userAdd,userPp;
        /* Deklarasi Variabel */
        
        System.out.print("Pilih Login:\n");
        System.out.print("1. Admin\n");
        System.out.print("2. Mahasiswa\n"); 
        System.out.print("Masukkan Pilihan:");
        /* Output Pilihan Yang Akan Dipilih */

        pilihan = deteksi.nextInt();
        deteksi.nextLine();
        /* Untuk Melakukan Proses Input ,Kemudian agar sesudah type data integer ada space */

        switch (pilihan) {
            /* Switch berdasarkan pilihan */
            case 1:
            System.out.print("Masukkan Username:");
            userAd = deteksi.nextLine();
            System.out.print("Masukkan Password:");
            userP = deteksi.nextLine();
            if(userAd.equalsIgnoreCase("Admin365") && userP.equalsIgnoreCase("Password365")){
                System.out.format("Admin Telah Berhasil Login\n");

            }else{
                System.out.format("Login Gagal!Username Atau Password salah!");
                /* 2 Kondisi, kondisi pertama apabila benar kondisi kedua apabila salah  */
            }


                
                break;
                /* menghentikan switch */
            case 2:
            System.out.print("Masukkan Nama:");
            userAdd = deteksi.nextLine();
            System.out.print("Masukkan NIM:");
            userPp = deteksi.nextLine();
            if(userAdd.equalsIgnoreCase("Abdullah Ali Zulfik") && userPp.equalsIgnoreCase("202410370110365")){
                System.out.format("Login Berhasil!\n");
                System.out.format("Nama: Abdullah Ali Zulfik\n");
                System.out.format("NIM: 202410370110365");
            }else{
                System.out.format("Login Gagal! Nama Atau Password Salah!\n");
            }
            break;

            default:
               System.out.format("Tidak Ada Pilihan Lain");

        }


    }
}
