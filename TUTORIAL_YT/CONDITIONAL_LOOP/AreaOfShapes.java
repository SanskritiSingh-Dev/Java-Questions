import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Isosceles Triangle");
        System.out.println("5. Parallelogram");
        System.out.println("6. Rhombus");
        System.out.println("7. Equilateral Triangle");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle: " + Math.PI * r * r);
                break;

            case 2:
                System.out.print("Enter base: ");
                double b = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                System.out.println("Area of Triangle: " + 0.5 * b * h);
                break;

            case 3:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter width: ");
                double w = sc.nextDouble();
                System.out.println("Area of Rectangle: " + l * w);
                break;

            case 4:
                System.out.print("Enter equal side: ");
                double s = sc.nextDouble();
                System.out.print("Enter base: ");
                double bi = sc.nextDouble();
                System.out.println("Area of Isosceles Triangle: " +
                        (bi / 4) * Math.sqrt(4 * s * s - bi * bi));
                break;

            case 5:
                System.out.print("Enter base: ");
                double bp = sc.nextDouble();
                System.out.print("Enter height: ");
                double hp = sc.nextDouble();
                System.out.println("Area of Parallelogram: " + bp * hp);
                break;

            case 6:
                System.out.print("Enter diagonal 1: ");
                double d1 = sc.nextDouble();
                System.out.print("Enter diagonal 2: ");
                double d2 = sc.nextDouble();
                System.out.println("Area of Rhombus: " + 0.5 * d1 * d2);
                break;

            case 7:
                System.out.print("Enter side: ");
                double se = sc.nextDouble();
                System.out.println("Area of Equilateral Triangle: " +
                        (Math.sqrt(3) / 4) * se * se);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
