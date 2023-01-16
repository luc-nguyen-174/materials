import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class MaterialManager {
    Material[] materials;

    public MaterialManager() {
        materials = new Material[10];
        materials[0] = new Meat(1, "pig meat 1st", LocalDate.of(2023, 1, 15), 5000, 2);
        materials[1] = new Meat(2, "pig meat 2nd", LocalDate.of(2023, 1, 14), 4000, 3);
        materials[2] = new Meat(3, "pig meat 3rd", LocalDate.of(2023, 1, 16), 3000, 4);
        materials[3] = new Meat(4, "beef 1st", LocalDate.of(2023, 1, 10), 15000, 3);
        materials[4] = new Meat(5, "beef 2nd", LocalDate.of(2023, 1, 11), 8000, 2);
        materials[5] = new CrispyFlour(6, "type 1", LocalDate.of(2023, 1, 15), 900, 2);
        materials[6] = new CrispyFlour(7, "type 2", LocalDate.of(2023, 1, 15), 600, 5);
        materials[7] = new CrispyFlour(8, "type 3", LocalDate.of(2023, 1, 15), 550, 4);
        materials[8] = new CrispyFlour(9, "type 4", LocalDate.of(2023, 1, 15), 500, 4);
        materials[9] = new CrispyFlour(10, "type 5", LocalDate.of(2023, 1, 15), 350, 5);
    }
    public void displayMaterials() {
        for (Material material : materials) {
            System.out.println("Id: " + material.getId());
            System.out.println("Name: " + material.getName());
            System.out.println("Manufacturing Date: " + material.getManufacturingDate());
            System.out.println("Cost: " + material.getCost());
            System.out.println("Amount: " + material.getAmount());
            System.out.println("Expiry Date: " + material.getExpiryDate());
            System.out.println("----------------------------------------------------------------");
        }
    }
}
