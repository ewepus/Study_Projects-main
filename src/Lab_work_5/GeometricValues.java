package Lab_work_5;

import java.util.Scanner;

public class GeometricValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine()) * 23;
        int b = Integer.parseInt(sc.nextLine()) * 23;
        int c = Integer.parseInt(sc.nextLine()) * 23;
        int d = Integer.parseInt(sc.nextLine()) * 23;
        int e = Integer.parseInt(sc.nextLine()) * 23;
        int f = Integer.parseInt(sc.nextLine()) * 23;
        System.out.printf("%.2f", perimeter(a, b, c, d, e, f));
    }

    public static double perimeter(int a, int b, int c, int d, int e, int f) {
        double sideA = Math.sqrt(Math.pow(c - a, 2) + Math.pow(d - b, 2));
        double sideB = Math.sqrt(Math.pow(e - c, 2) + Math.pow(f - d, 2));
        double sideC = Math.sqrt(Math.pow(a - e, 2) + Math.pow(b - f, 2));
        return (sideA + sideB + sideC);
    }
}
//var_9