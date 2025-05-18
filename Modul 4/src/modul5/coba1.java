package modul5;
import java.util.Scanner;
public class coba1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama[] = new String[10];
        int j = 1;
        for(int i = 0; i < 10 ; i++ ){
            nama[i] = scan.nextLine();
            System.out.println("Inputan Ke-" + j + " Adalah:" + nama[i]);
                    j++;

        }

    }
}
