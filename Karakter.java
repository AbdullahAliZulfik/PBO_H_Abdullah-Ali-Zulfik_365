package codelab;
/* Ini adalah Parent class/superclass
 * Jadi pake package gitu intinya mengelompokkan class disatu folder
 */


public class Karakter {
    private String nama;
    private int kesehatan;
    /*pake modifier private jadi atribut hanya bisa diakses dengan memanggil getter dan bisa diubah dengan setter */

              
    
    public  Karakter(String nama , int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
        /*this itu kaya nandain kala yang dimaksud itu variabel nama dan kesehatan gitu */

    }
    public String getNama(){
        return nama;
        /*jadi ini kaya kunci buat akses atribut nama yg private tadi */
    }

    public void setNama(String nama){
        this.nama = nama;
        /* nah ini buat ngubah isi atribute tadi */
    }

    public int getKesehatan(){
        return kesehatan;
        /*Ini kunci buat ngakses atribut kesehatan */
    }
    public void setKesehatan(int kesehatan){
        this.kesehatan = kesehatan;
        /*Ini suapaya bisa ngubah gitu */
    }

    public void serang(Karakter target){
        System.out.println(nama + " Menyerang" + target.getNama());
        /*Method adapun karakter adalah class adapun target adalah objectnya  */
    }

    
    
}
