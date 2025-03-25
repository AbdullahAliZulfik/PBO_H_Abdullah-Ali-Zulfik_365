package codelab;
/* Ini adalah subcalss pertama */

public class Hero extends Karakter {
    /*Extend itu berarti pewarisan ini berarti class hero ini adalah subclass/child class dari karakter
     * jadi ia mewarisi method,atribut
     */
    public Hero(String nama, int kesehatan){
        super(nama,kesehatan);
        /*Diatas adalah constructor yang mana ia menggunakan super jadi child class itu mengambil
         * construcor yang ada diparentt class
         */
    }
    @Override
    /*Override itu sederhananya kita mengubah method yg ada diparentclass menjadi apa yang kita inginkan
     * di child class
     */
    public void serang(Karakter target){
        System.out.println(getNama() + " Memukul " + target.getNama() + " Dengan Pukulan Ultra Smash!!! ");
        target.setKesehatan(target.getKesehatan() - 15);
        /*method */
    }
}
