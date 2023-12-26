package J04002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String c = sc.next();
        c = c.toLowerCase();
        c = String.valueOf(c.charAt(0)).toUpperCase() + c.substring(1);
        Rectange van = new Rectange(w, h, c);
        if (w <= 0 || h <= 0)
            System.out.println("INVALID");
        else {
            System.out.printf("%.0f %.0f %s", van.findPerimeter(), van.findArea(), van.getColor());
        }
    }
}