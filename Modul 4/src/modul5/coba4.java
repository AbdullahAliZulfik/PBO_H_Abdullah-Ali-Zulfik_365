package modul5;
import java.util.ArrayList;
public class coba4 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> identity = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<>();
        temp.add("Abdullah Ali ZUlfik");
        temp.add("202410370110365");

        identity.add(temp);
        System.out.println("Nama: " + identity.get(0).get(0));
        System.out.println("NIM: " + identity.get(0).get(1));
    }
}
