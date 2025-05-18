package modul5;
import java.util.Scanner;
public class coba2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String nama[][] = new String[3][5];
        int a = 1 , b = 1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                nama[i][j] = scan.nextLine();
            }
        }
for(int i = 0; i < 3; i++ ){
    for(int j = 0; j < 5 ; j++){
        System.out.println("Ini Adalah Baris ke-" + (i + 1) +  " Dan Ini Adalah Kolom Ke-" + (j + 1) +" Dengan Isi : Adalah:" + nama[i][j]);
    }
}


    }
}
