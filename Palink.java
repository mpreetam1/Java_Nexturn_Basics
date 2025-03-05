import java.util.Scanner;

public class Palink {
    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter a string: ");
        String str = sc.next();
        System.out.println("Is Palindrome? " + isPalindrome(str));

        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Is Palindrome? " + isPalindrome(num));

        sc.close();
    }
}