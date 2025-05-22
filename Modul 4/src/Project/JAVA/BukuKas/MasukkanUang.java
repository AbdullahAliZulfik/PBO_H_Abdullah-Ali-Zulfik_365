package Project.JAVA.BukuKas;

import java.util.Scanner;
public class MasukkanUang extends Bukukas{
    public MasukkanUang(int inputUang, int jumlahUang){
        super(inputUang,jumlahUang);
    }
    Scanner scan = new Scanner(System.in);
    @Override
            public void masukkanUang() {

        while(true) {
            System.out.printf("Ketik (0) untuk mengakhiri");
            System.out.printf("Berapa Banyak Uang Yang Ingin Anda Masukkan:");
                    inputUang = scan.nextInt();
            jumlahUang += inputUang;
            System.out.printf("Jumlah Uang: Rp.%d\n",jumlahUang);

            if(inputUang == 0){
                break;
            }


        }

    }
}
