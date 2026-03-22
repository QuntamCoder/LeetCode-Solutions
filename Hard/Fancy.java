package Hard;

import java.util.*;

public class Fancy {

    List<Long> list;
    long mul = 1;
    long add = 0;
    long mod = 1000000007;

    public Fancy() {
        list = new ArrayList<>();
    }

    public void append(int val) {
        long x = (val - add + mod) % mod;
        x = (x * modInverse(mul)) % mod;
        list.add(x);
    }

    public void addAll(int inc) {
        add = (add + inc) % mod;
    }

    public void multAll(int m) {
        mul = (mul * m) % mod;
        add = (add * m) % mod;
    }

    public int getIndex(int idx) {
        if (idx >= list.size()) return -1;

        long val = list.get(idx);
        val = (val * mul + add) % mod;
        return (int) val;
    }

    private long modInverse(long x) {
        return power(x, mod - 2);
    }

    private long power(long a, long b) {
        long res = 1;
        a %= mod;

        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % mod;

            a = (a * a) % mod;
            b >>= 1;
        }

        return res;
    }
}