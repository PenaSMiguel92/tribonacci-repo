import java.util.Map;
import java.util.HashMap;

public class Solution {
    Map<Integer, Integer> memo = new HashMap<>();

    public int tribonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        if (n == 0)
            return 0;
        if (n == 1 || n == 2)
            return 1;
        int val = tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
        if (!memo.containsKey(n)) {
            memo.put(n, val);
        }
        return val;
    }
}
