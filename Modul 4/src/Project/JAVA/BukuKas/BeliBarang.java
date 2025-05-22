package Project.JAVA.BukuKas;
import java.util.Scanner;
public class BeliBarang extends Bukukas{
    public BeliBarang(String namaBarang, int hargaBarang){
        super(namaBarang,hargaBarang);
    }
    Scanner scan = new Scanner(System.in);
    @Override
    public void beliBarang(){
        while(true) {

            System.out.printf("Tekan (0) untuk keluar Dari Menu");
            System.out.printf("Nama Barang/Jasa Yang Dibeli:");
            namaBarang = scan.nextLine();
            System.out.printf("Harganya Adalah:");
            hargaBarang = scan.nextInt();

            if (namaBarang.equalsIgnoreCase('0') || hargaBarang == 0){
                break;
            }

        }
    }

}
