package Laba;

public class Primes {
    public static void main(String[] args) {
        for (int i=0; i != 100; i++){//Цикл с числами на проверку
            if (isPrimes(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimes(int n) { // Функция с логическим выводом для понимая какое число простое а какое нет
        double sqrt = Math.sqrt(n);
        if(n % 2 == 0){ //Исключаем попдание всех четных чисел как они по определению не могут быть простыми
            return false;
        }
        for (int i = 3; i <= n; i += 2) { //Исключаем попадания всех четных чисел как они по определению не могут быть простыми
            if ((i > sqrt)) {//Проверка еще одного правила делителями могут быть только те простые числа,
                                // которые не превосходят квадратного корня из проверяемого числа
                return true;
            }
            if (n % i == 0) {
                return false;
            }
        }
        return false;
    }
}