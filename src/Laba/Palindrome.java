package Laba;

public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " " + isPalindrome(s));
        }
    }
    public static String reverseString(String s){//Реверс строки
        return new StringBuilder(s).reverse().toString();

    }
    public static boolean isPalindrome(String s){//Сравнение с преведущим
       String s1 = reverseString(s);
       return s1.equals(s);
    }
}