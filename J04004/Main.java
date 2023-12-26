package J04004;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        Ps v1 = new Ps(a, b);
        v1.rutgon();

        a = sc.nextLong();
        b = sc.nextLong();
        Ps v2 = new Ps(a, b);
        v2.rutgon();

        v1.add(v2);
        v1.rutgon();
        v1.in();
    }
}