package com.coba.coba1;

public class main {
    public static void main(String[] args) {
        coba hero = new coba();
        coba hero2 = new coba("Abdullah Ali");
        coba hero3 = new coba("Zulfik",20);


        Superman pahlawan = new Superman("Hulk", 30);
        Superman pahlawan2 = new Superman("Batman", 25);
        Superman pahlawan3 = new Superman("Wonder Woman", 19);

        hero.melindungi();
        hero2.melindungi();
        hero3.melindungi();

        pahlawan.attack("Pembegal", 30);
        pahlawan2.attack("Maling",20);
        pahlawan3.terbang();
        pahlawan2.attack("Joker","Spiderman");


    }
}
