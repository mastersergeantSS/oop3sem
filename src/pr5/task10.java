package pr5;

public class task10 {
    public static int reverse(int num) {
        if (num != 0) {
            int tmp = num;
            int lastD = num % 10;
            while (tmp > 10) {
                tmp /= 10;
                lastD *= 10;
            }
            return lastD + reverse(num/10);
        }

        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(reverse(314292312));
    }
}
