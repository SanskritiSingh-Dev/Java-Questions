/*Perimeter Of Circle
Perimeter Of Equilateral Triangle
Perimeter Of Parallelogram
Perimeter Of Rectangle
Perimeter Of Square
Perimeter Of Rhombus */

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Menu for shape selection
        System.out.println("Choose a shape to calculate perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Equilateral Triangle");
        System.out.println("3. Parallelogram");
        System.out.println("4. Rectangle");
        System.out.println("5. Square");
        System.out.println("6. Rhombus");
        // User choice
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Perimeter of Circle: " + 2 * Math.PI * r);
                break;

            case 2:
                System.out.print("Enter side length: ");
                double s = sc.nextDouble();
                System.out.println("Perimeter of Equilateral Triangle: " + 3 * s);
                break;

            case 3:
                System.out.print("Enter lengths of two adjacent sides:\n");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Perimeter of Parallelogram: " + 2 * (a + b));
                break;

            case 4:
                System.out.print("Enter length and width:\n");
                double l = sc.nextDouble();
                double w = sc.nextDouble();
                System.out.println("Perimeter of Rectangle: " + 2 * (l + w));
                break;

            case 5:
                System.out.print("Enter side length: ");
                double side = sc.nextDouble();
                System.out.println("Perimeter of Square: " + 4 * side);
                break;

            case 6:
                System.out.print("Enter lengths of two diagonals:\n");
                double d1 = sc.nextDouble();
                double d2 = sc.nextDouble();
                double sideRhombus = Math.sqrt((d1 * d1 + d2 * d2) / 4);
                System.out.println("Perimeter of Rhombus: " + 4 * sideRhombus);
                break;

            default:
                System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
    
}
