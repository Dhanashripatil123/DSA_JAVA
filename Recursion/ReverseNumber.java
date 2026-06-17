public class ReverseNumber {
    static int reverse(int rev,int num) {
        if (num == 0) {
            return rev;
        }

        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        int num = 12345;
        int result = reverse(0, num);

        System.out.println(result); // 54321
    }
}