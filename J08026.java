import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package PACKAGE_NAME
 * @date 12/18/2023 3:46 PM
 * @Copyright T.may
 */
public class J08026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int[] f = new int[10005];
            int s = sc.nextInt();
            int t = sc.nextInt();
            if (s > t) {
                System.out.println(s-t);
            }
            else {
                ArrayDeque<Pair> a = new ArrayDeque<>();
                a.addLast(new Pair(s, 0));
                f[s] = 1;
                while (!a.isEmpty()) {
                    Pair k = a.pollFirst();
                    if (k.getF()*2 == t || k.getF()-1 == t) {
                        System.out.println(k.getL()+1);
                        break;
                    }
                    if (k.getF()*2 < 10005 && f[k.getF()*2] == 0) {
                        a.addLast(new Pair(k.getF()*2, k.getL()+1));
                        f[k.getF()*2] = 1;
                    }
                    if (k.getF()-1>=0 && f[k.getF()-1] == 0) {
                        a.addLast(new Pair(k.getF()-1, k.getL()+1));
                        f[k.getF()-1] = 1;
                    }
                }
            }
        }
    }
}

class Pair {
    private int f, l;

    public Pair(int f, int l) {
        this.f = f;
        this.l = l;
    }

    public int getF() {
        return f;
    }

    public int getL() {
        return l;
    }
}