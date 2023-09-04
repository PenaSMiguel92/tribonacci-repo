public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.tribonacci(4));
        System.out.println(sol.tribonacci(25));
        System.out.println(sol.tribonacci(100));

        int n = 0;
        while (n <= 37) {
            System.out.println(sol.tribonacci(n));
            n++;
        }
    } 
}
