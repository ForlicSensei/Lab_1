package Laba;

public class Ez_Primes {
    public static void main(String[] args) {
        for (int i = 1; i != 100; i++) {
            if (isPrimesez(i) == true) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimesez(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
