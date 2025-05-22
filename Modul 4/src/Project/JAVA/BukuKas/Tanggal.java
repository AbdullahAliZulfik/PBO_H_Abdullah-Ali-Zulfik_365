package Project.JAVA.BukuKas;
import java.util.Scanner;
public class Tanggal extends Bukukas {
    Scanner scan = new Scanner(System.in);
public Tanggal(String hari, String Bulan, String tahun){
    super(hari,Bulan,tahun);
}
void tanggal(){
    System.out.printf("Masukkan Hari, Bulan, Tahun:");
    hari = scan.nextLine();
    Bulan = scan.nextLine();
    tahun = scan.nextLine();
}
}
