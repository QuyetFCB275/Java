//package ThucHanh24_9;
//
//import java.util.Scanner;
//
//import static java.lang.Math.max;
//
//public class B3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            String a = sc.next();
//
//            int arr[] = new int[200];
//            for (Character x : a.toCharArray())
//                arr[x]++;
//            String s = "";
//            for (Character x : a.toCharArray()) {
//                if (arr[x] > 1)
//                    s += x;
//            }
//
//            int ans=0;
//            for (int i=0; i<s.length(); i++) {
//                String b = s.substring(0, i) + s.substring(i+1);
//                int[][] f = new int[s.length()+5][b.length()+5];
//                for (int j=0; i<=s.length(); i++) {
//                    f[j][0] = 0;
//                }
//                for (int j=0; i<=b.length(); i++) {
//                    f[0][j] = 0;
//                }
//
//                for (int k=1; k<=s.length(); k++) {
//                    for (int j=1; j<=b.length(); j++) {
//                        if (s.charAt(k-1) == b.charAt(j-1))
//                            f[k][j] = f[k-1][j-1] + 1;
//                        else
//                            f[k][j] = max(f[k][j-1], f[k-1][j]);
//                    }
//                }
//                ans = max(ans, f[s.length()][b.length()]);
//            }
//            System.out.println(ans);
//        }
//    }
//}
