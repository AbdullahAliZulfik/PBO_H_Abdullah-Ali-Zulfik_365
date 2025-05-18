package com.coba.coba1;

public class Superman extends coba {
    public Superman(String name, int umur){
        super(name, umur);
    }

    public void attack(){
        System.out.println("Superman Menyerang Musuh!");
    }

    public void attack(String enemyName){
        System.out.println("Superman Menyerang " + enemyName);
    }

    public void attack(String enemyName,int jumlah){
        System.out.println("Superman Menyerang " + enemyName + " Yang Berjumlah " + jumlah);
    }
    public void attack(String enemyNamee, String bantuan){
        System.out.println(getName() + " Menghabisi " + enemyNamee + " Dengan bantuan " + bantuan);
    }

    public void terbang(){
        System.out.println(getName() + " terbang");
    }
    @Override
    public void melindungi(){
        System.out.println(getName() + " Melindungi Masyarakat Bumi Dari Serangan Monster");
    }
}
