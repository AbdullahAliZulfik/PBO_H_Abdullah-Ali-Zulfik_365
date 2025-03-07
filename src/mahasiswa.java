import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class mahasiswa{
        public static void main(String[] args) {
                LocalDateTime waktuSekarang = LocalDateTime.now();
                DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                System.out.println(" Waktu Sekarang Adalah: "+ waktuSekarang.format(formatWaktu));
                System.out.println("Bulan Sekarang Ada;ah:"+ waktuSekarang.getMonth());
         
}
}
