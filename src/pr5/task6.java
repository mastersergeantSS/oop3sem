package pr5;

public class task6 {
    public static boolean isPrime(int n, int divr) {
        if (divr == 2) return true;

        if (n % (divr-1) == 0) return false;

        return  isPrime(n, divr-1);
    }

    public static void main(String[] args) {
        if (isPrime(73, 73))
            System.out.println("YES");
        else System.out.println("NO");

    }
}
