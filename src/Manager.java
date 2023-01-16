//import java.time.LocalDate;
//import java.util.Scanner;
//
//public class Manager {
//    public static Material[] getMaterials(String id, String name, LocalDate manufacturingDate, int cost, double weight, int quantity) {
//        System.out.println("Materials:");
//        Scanner scanner = new Scanner(System.in);
//        int materialsCount = scanner.nextInt();
//
//        Material[] materials = new Material[materialsCount];
//        for (int i = 0; i < materialsCount; i++) {
//            System.out.println("Id:" + (i + 1));
//            int selection;
//            System.out.println("1. Meat");
//            System.out.println("2. Crispy Flour");
//            selection = scanner.nextInt();
//            if (selection == 1) {
//                id = String.valueOf(i + 1);
//
//                System.out.println("Name: ");
//                name = scanner.toString();
//
//                System.out.println("Cost: ");
//                cost = scanner.nextInt();
//
//                System.out.println("Weight: ");
//                weight = scanner.nextInt();
//                materials[i] = new Meat(id, name, manufacturingDate, cost, weight);
//            } else if (selection == 2) {
//                id = String.valueOf(i + 1);
//
//                System.out.println("Name: ");
//                name = scanner.toString();
//
//                System.out.println("Cost: ");
//                cost = scanner.nextInt();
//                System.out.println("Quantity: ");
//                quantity = scanner.nextInt();
//                materials[i] = new CrispyFlour(id, name, manufacturingDate, cost, quantity);
//            }
//        }
//        return materials;
//    }
//}
