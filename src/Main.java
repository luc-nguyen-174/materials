import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Material[] materials = new Material[10];
        materials[0] = new Meat(1, "pig meat 1st", LocalDate.now(), 5000, 2);
        materials[1] = new Meat(2, "pig meat 2nd", LocalDate.now(), 4000, 3);
        materials[2] = new Meat(3, "pig meat 3rd", LocalDate.now(), 3000, 4);
        materials[3] = new Meat(4, "beef 1st", LocalDate.now(), 15000, 3);
        materials[4] = new Meat(5, "beef 2nd", LocalDate.now(), 8000, 2);
        materials[5] = new CrispyFlour(6, "type 1", LocalDate.now(), 900, 2);
        materials[6] = new CrispyFlour(7, "type 2", LocalDate.now(), 600, 5);
        materials[7] = new CrispyFlour(8, "type 3", LocalDate.now(), 550, 4);
        materials[8] = new CrispyFlour(9, "type 4", LocalDate.now(), 500, 4);
        materials[9] = new CrispyFlour(10, "type 5", LocalDate.now(), 350, 5);
    }

    public static Material[] addMaterials(Material[] materials) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of materials: ");
        int number = scanner.nextInt();
        for (int i = 0; i < materials.length; i++) {

        }
        return materials;
    }
}