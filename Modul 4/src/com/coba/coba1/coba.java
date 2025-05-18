package com.coba.coba1;

public class coba {

        private String name;
        public int umur;

        public coba(String name){
            this.name = name;
        }

        public coba(){

        }

        public coba(String name, int umur){
            this.name = name;
            this.umur = umur;
        }
        void melindungi(){
            System.out.println(name + " Melindungi Masyarakat Dari Bahaya! Dan Umurnya Adalah" + umur);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }





