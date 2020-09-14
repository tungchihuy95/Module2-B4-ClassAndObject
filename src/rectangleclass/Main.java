package rectangleclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();

        RectangleClass rectangleClass = new RectangleClass(width, height);
        System.out.println("Dien tich hinh chu nhat la: " + rectangleClass.getArea());
        System.out.println("Chu vi hinh chu nhat la: " + rectangleClass.getPerimeter());
        System.out.println(rectangleClass.display());
    }
}
