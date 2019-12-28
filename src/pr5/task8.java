package pr5;

public class task8 {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1)  return true;

        if (str.charAt(0) != str.charAt(str.length() - 1))  return false;

        return isPalindrome(str.substring(1, str.length() - 1));

    }

    public static void main(String[] args) {
        if (isPalindrome("шалаш"))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
