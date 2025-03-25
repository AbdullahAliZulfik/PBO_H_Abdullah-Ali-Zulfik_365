package codelab;
/*Jadi ini package 
 * kemudian ini adalah class driver
 */



public class Main {
    public static void main(String[] args) {
        Karakter npc = new Karakter("Lich King", 1000);
        Hero pahlawan = new Hero("Zulfik",100);
        Musuh villain = new Musuh("Megumin",80);
        /*Diatas adalah Proses memanggil object */

        System.out.println("Status:\n");
        System.out.println(npc.getNama() + " Saat Ini Memiliki HP: " + npc.getKesehatan());
        System.out.println(  pahlawan.getNama() + " Saat Ini Memiliki HP: " + pahlawan.getKesehatan());
        System.out.println(  villain.getNama()+ " Saat Ini Memiliki HP: " + villain.getKesehatan() );
        /*Println digunakan untuk membuat output mengapa ketika memanggil atribute ada getNama()
         * dikarenakan di Parentclass/superclass nama itu pake modifier private
         */

        pahlawan.serang(villain);
        System.out.println("HP " + villain.getNama() + " Saat ini " + villain.getKesehatan());
        /*Diatas adalah method didalam parameter ada object villain  */

        villain.serang(pahlawan);
        System.out.println("Hp " + pahlawan.getNama() + " Saat ini " + pahlawan.getKesehatan());
        /*Diatas adalah method didalam parameter ada object pahlawan */
    }
    
}
