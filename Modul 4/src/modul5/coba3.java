package modul5;
import java.util.ArrayList;
public class coba3 {
    public static void main(String[] args) {
        ArrayList<String> penampung = new ArrayList<>();
        penampung.add("Abdullah Ali Zulfik");
        penampung.add("NIM: 202410370110365");
        penampung.add("zehahahahaah");
                System.out.println(penampung);
                penampung.remove(1);
                System.out.println(penampung);
                System.out.println(penampung.get(0));
                String removedItem = penampung.remove(1);
                penampung.add(1,removedItem);

                for(int i = 0; i < penampung.size(); i++ ){
                    System.out.println(penampung.get(i));
                }
    }
}
