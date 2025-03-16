

class Hewan{
    String Nama ;
    String Suara;
    String Jenis;

    void tampilkanInfo(){
        System.out.println("Name:" + Nama);
        System.out.println("Jenis:" + Jenis);
        System.out.println("Suara:" + Suara);
        System.out.println();
    }
}



public class Colab1 {
    public static void main(String[] args) {
     
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.Nama = "Kucing";
        hewan1.Jenis = "Mamalia";
        hewan1.Suara = "Nyan~~ miauuuuuuuuuuu";

        hewan2.Nama = "Anjiiiing";
        hewan2.Jenis = "Mamalia";
        hewan2.Suara = "Woof-Woof Auuuuuuuu";

        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
        
    }

    
}
