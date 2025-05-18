package modul5.modul5.codeLab;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        ArrayList<barang> barang1 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
barang1.add(new barang("pulpen",1));
barang1.add(new barang("buku", 1));
        while (true) {
            System.out.printf("=========== Program Manajemen Barang ===========\n");
            System.out.printf("1. Tambahkan Barang Baru\n");
            System.out.printf("2. Tampilkan Semua Barang\n");
            System.out.printf("3. Hapus Barang\n");
            System.out.printf("4. Kurangi Stok\n");
            System.out.printf("5. Keluar\n");
            int pilihan = scan.nextInt();
            scan.nextLine();
            switch (pilihan) {
                case 1:
                    try {
                        int stok;

                        System.out.printf("Masukkan Nama Barang:");
                        String nama = scan.nextLine();

                        while (true) {
                            try {


                                System.out.printf("Masukkan Jumlah Stok:");
                                 stok = scan.nextInt();

                                if (stok < 0) {
                                    throw new exception("Stok Barang Tidak Boleh Negatif\n");
                                }
                                break;


                            } catch (InputMismatchException e) {
                                System.out.println("Ada Error Terjadi Ada Kesalahan, Input Harus Berupa Angka");
                            } catch (exception e) {
                                System.out.println("Error: " + e.getMessage());
                            }
                        }
                        barang daftarBarang = new barang(nama, stok);
                        barang1.add(daftarBarang);
                    }finally {
                    System.out.printf("Ada Kesalahan Input\n");
                    break;
                }

                case 2:
                    System.out.printf("===== Menu Daftar Barang =====\n");
                    Iterator<barang> iterator = barang1.iterator();
                    while (iterator.hasNext()) {
                        barang b = iterator.next();
                        System.out.println("Nama: " + b.getNama() + " Stok: " + b.getStok());
                    }
                    break;

                case 3:
                    System.out.printf("==== Opsi Menghapus Barang===\n");
                    for (int i = 0; i < barang1.size(); i++) {
                        barang b = barang1.get(i);
                        System.out.println("Nama Barang: " + b.getNama() + " Stok Barang: " + b.getStok() + " Nomor Indeks:" + i);
                    }
                    System.out.printf("Barang Dengan Nomor Indeks Mana Yang Mau Dihapus?:");
                    int pilihan1 = scan.nextInt();
                    if (pilihan1 == 0 + pilihan1) {
                        barang1.remove(0 + pilihan1);
                    }
                    break;
                case 4:
                    System.out.printf("===== Mengurangi Stok Barang =====\n");
                    for(int j = 0; j < barang1.size(); j++) {
                        barang b = barang1.get(j);
                        System.out.println("Nama Barang: " + b.getNama() + " Stok Barang: " + b.getStok() + " Nomor Indeks:" + j);

                    }

                        try {
                           System.out.printf("Masukkan Indeks Barang Yang Ingin Dikurangi Stoknya:");
                           int indeks = scan.nextInt();

                           if(indeks < 0 || indeks >= barang1.size()){
                               throw new IndexOutOfBoundsException();
                           }
                           barang barangDipilih = barang1.get(indeks);

                           System.out.printf("Berapa Banyak Stok Yang Ingin Diambil?:");
                           int jumlah = scan.nextInt();
                           try {
                               if (jumlah > barangDipilih.getStok()) {
                                   throw new exception("Stok Tidak Mencukupi!");


                               } else if (jumlah < 0) {
                                   System.out.println("Jumlah Tidak Boleh Negatif!");

                               } else {
                                   barangDipilih.setStok(barangDipilih.getStok() - jumlah);
                                   System.out.println("Stok Berhasil Dikurangi Sisa Stok: " + barangDipilih.getStok());
                               }

                           } catch (Exception e) {
                               System.out.println("Error: " + e.getMessage());
                           }
                        } catch (InputMismatchException e) {
                            System.out.printf("Input Harus Berupa Angka!!!\n");

                        } catch (IndexOutOfBoundsException e) {
                            System.out.printf("Kamu salah Cari Indeks Atau Stok Tidak Mencukupi!!!\n");

                        }


                    break;

                case 5:
                    System.out.printf("Program Ruwet Akan Berakhir!!!!!!\n");
                            scan.close();
                    return;




            }

        }
    }
}