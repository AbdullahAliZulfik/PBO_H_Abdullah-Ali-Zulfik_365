
import java.nio.file.SecureDirectoryStream;

public class cobamodul2 {
    String merk;
    String model;
    int tahun;
    String spekMesin;
    String transmisi;

    public void menyalakanMesin(){
        System.out.println("Mesin mobil Menyala");
    }

    public String mengemudi(String arah){
        return "Mobil bergerak ke arah " + arah;
    }

    public String mengerem(){
        return "Berhenti";
    }
    public int topSpeed(int topSpeed){
        return topSpeed;
    }

    public static void main(String[] args) {
        
    }

    
}
