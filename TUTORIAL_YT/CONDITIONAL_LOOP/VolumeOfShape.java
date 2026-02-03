/*Volume Of Cone Java Program
Volume Of Prism
Volume Of Cylinder
Volume Of Sphere
Volume Of Pyramid
Curved Surface Area Of Cylinder
Total Surface Area Of Cube */

import java.util.Scanner;
public class VolumeOfShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate volume:");
        System.out.println("1. Cone");
        System.out.println("2. Prism");
        System.out.println("3. Cylinder");
        System.out.println("4. Sphere");
        System.out.println("5. Pyramid");
        System.out.println("6. Curved Surface Area of Cylinder");
        System.out.println("7. Total Surface Area of Cube");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius and height: ");
                double r = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println("Volume of Cone: " + (1.0 / 3) * Math.PI * r * r * h);
                break;

            case 2:
                System.out.print("Enter base area and height: ");
                double baseArea = sc.nextDouble();
                double height = sc.nextDouble();
                System.out.println("Volume of Prism: " + baseArea * height);
                break;

            case 3:
                System.out.print("Enter radius and height: ");
                double radius = sc.nextDouble();
                double heightCyl = sc.nextDouble();
                System.out.println("Volume of Cylinder: " + Math.PI * radius * radius * heightCyl);
                break;

            case 4:
                System.out.print("Enter radius: ");
                double radiusSphere = sc.nextDouble();
                System.out.println("Volume of Sphere: " + (4.0 / 3) * Math.PI * Math.pow(radiusSphere, 3));
                break;

            case 5:
                System.out.print("Enter base area and height: ");
                double baseAreaPyr = sc.nextDouble();
                double heightPyr = sc.nextDouble();
                System.out.println("Volume of Pyramid: " + (1.0 / 3) * baseAreaPyr * heightPyr);
                break;

            case 6:
                System.out.print("Enter radius and height: ");
                double radiusCSA = sc.nextDouble();
                double heightCSA = sc.nextDouble();
                System.out.println("Curved Surface Area of Cylinder: " + 2 * Math.PI * radiusCSA * heightCSA);
                break;

            case 7:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                System.out.println("Total Surface Area of Cube: " + 6 * side * side);
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
    
}
