package J05063;

class  DaThuc {
    int[] arr = new int[10005];
    public DaThuc() {}
    public DaThuc(String s) {
        String[] str = s.split(" ");
        for (String x : str) {
            if (x.length() > 1) {
                int k = Integer.parseInt(x.substring(0, x.indexOf("*")));
                int idx = Integer.parseInt(x.substring(x.indexOf("^") + 1));
                arr[idx] = k;
            }
        }
    }
    public DaThuc cong(DaThuc b) {
        DaThuc res = new DaThuc();
        for (int i=0; i<10005; i++) {
            res.arr[i] = this.arr[i] + b.arr[i];
        }
        return res;
    }
    @Override
    public String toString() {
        String ans = "";
        for (int i=10000; i>=0; i--) {
            if (arr[i] > 0) {
                ans += arr[i] + "*x^" + i + " + ";
            }
        }
        return ans.substring(0, ans.length() - 3);
    }
}