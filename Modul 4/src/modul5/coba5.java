package modul5;
import java.util.ArrayList;
import java.util.Iterator;
public class coba5 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Ali");
        name.add("Zulfik");
        name.add("Abdullah");
        Iterator<String> iterator = name.iterator();
        while(iterator.hasNext()){
            System.out.println(("Nama:")+ iterator.next());
        }

    }
}
