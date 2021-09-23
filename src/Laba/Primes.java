package Laba;

public class Primes {
    public static void main(String[] args) {
        for (int i=0; i != 100; i++){
            if (isPrimes(i) == true){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimes(int n) {
        double sqrt = Math.sqrt(n);
        if(n % 2 == 0){
            return false;
        }
        for (int i = 3; i <= n; i += 2) {
            if ((i > sqrt)) {
                return true;
            }
            if (n % i == 0) {
                return false;
            }
        }
        return false;
    }
}