package codelab;
/* Ini adalah subclass/childclass yang kedua */


 public class Musuh extends Karakter{
    /*Jadi class musuh mewarisi dari karakter */
    public  Musuh (String nama,int kesehatan){
        super(nama, kesehatan);
/*Constructor dan pakai super buat ngambil constructor yang ada diparentclass tapi disini bakalan kita ubah */
        
    }
    @Override
    /*Override ini buat kita ngubah apa yang tadi di parent class ke versi di childclass */
    public void serang( Karakter target){
        System.out.println(getNama() +" Menyihir "+ target.getNama()+" Dengan Sihir Explotioooooooon!!!! ");
        target.setKesehatan(target.getKesehatan() - 50);
        /*Method */
}
 }