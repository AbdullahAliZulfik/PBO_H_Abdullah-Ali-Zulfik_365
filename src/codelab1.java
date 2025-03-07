import java.time.LocalDate;
import java.util.Scanner;


/* Diatas Adalah API */
public class codelab1 {
    /* Diatas Adalah Class */
    public static void main(String[] args) {
        /* Diatas itu singkatnya seperti fungsi main() di c */
        Scanner scan = new Scanner(System.in);
        int tahunLahir;
     
        String nama;
        String kelamin;
        

       /* Diatas itu adalah deklarasi variabel integer dan string dan memanggil yah buat ngescan gitu */
        System.out.print("Masukkan Nama Anda:");
        nama = scan.nextLine();
      /* Diatas untuk membuat output dan input */
        System.out.print("Masukkan Jenis Kelamin(P/L):");
        kelamin = scan.nextLine();
        while (true) { 
            
        
        System.out.print("Masukkan Tahun Lahir:");
        tahunLahir = scan.nextInt();
        
        
        if(tahunLahir > 0){
            break;
        }
    }
        /* Ada Logika Agar Inputan Tahun Tidak Negatif */
        /* intinya membuat output dan input */
        int tahunSekarang = LocalDate.now().getYear();
        int usia = tahunSekarang - tahunLahir;
        /* Untuk mengambil data tahun sekarang dari sistem Kemudian disimpan di Variabel tahunSekarang */
        /*Kemudian usia ditentukan dengan cara mengurangkan kedua variabel diatas */
        if(String.valueOf(kelamin).equalsIgnoreCase("L") || String.valueOf(kelamin).equalsIgnoreCase("lA") ){
        kelamin = "Laki-Laki";
        System.out.println("Data Diri:");
        System.out.format("Nama   :%s\n",nama);
        System.out.format("Jenis Kelamin:%s\n",kelamin);
        System.out.format("Tahun Lahir:%d;",usia);
        /* Implementasi dari kondisi jika terpenuhi */
       
    }else{
        kelamin = "Perempuan";
        System.out.println("Data Diri:");
        System.out.format("Nama   :%s\n",nama);
        System.out.format("Jenis Kelamin:%s\n",kelamin);
        System.out.format("Usia:%d;",usia);
        /* Implementasi dari kondisi jika terpenuhi */

    }
    scan.close();
    /* Menutup Scan */
}

}