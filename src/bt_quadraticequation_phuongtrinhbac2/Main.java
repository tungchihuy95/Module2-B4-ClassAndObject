package bt_quadraticequation_phuongtrinhbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();


        //Vì tạo QuadraticEquation ở bên class khác nên lớp Main này phải tạo new 1 QuadraticEquation
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Nghiem delta la: " + quadraticEquation.getDiscriminant());
            if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println("Nghiem t1 cua phuong trinh bac 2 la: " + quadraticEquation.getRoot1());
                System.out.println("Nghiem t2 cua phuong trinh bac 2 la: " + quadraticEquation.getRoot2());
            } else if(quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phuong trinh co nghiem kep: " + quadraticEquation.getRoot3());
            }else {
                System.out.println("Phuong trinh vo nghiem!");
            }

    }
}
