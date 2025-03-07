import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Diri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String name = scan.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String gender = scan.nextLine().toUpperCase();

        System.out.print("Masukkan tahun lahir: ");
        int birthYear = scan.nextInt();

        LocalDate now = LocalDate.now();
        LocalDate birth = LocalDate.of(birthYear, 1, 1);
        Period age = Period.between(birth, now);
        int years = age.getYears();

        String genderOutput;
        if (gender.equals("L")) {
            genderOutput = "Laki-laki";
        } else if (gender.equals("P")) {
            genderOutput = "Perempuan";
        } else {
            genderOutput = "Jenis kelamin tidak valid";
        }

        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + name);
        System.out.println("Jenis Kelamin : " + genderOutput);
        System.out.println("Umur          : " + years + " tahun");

        scan.close();
    }
}
