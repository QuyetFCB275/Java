package J04003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PS van = new PS(a, b);
        van.rutgon();
        System.out.println(van);
    }
}