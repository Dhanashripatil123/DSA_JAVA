public class CompareTo {

    static int myCompareTo(String a, String b) {

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {

            if (a.charAt(i) != b.charAt(i)) {

                return a.charAt(i) - b.charAt(i);
            }
        }

        return a.length() - b.length();
    }

    public static void main(String[] args) {

        String a = "aarsh";
        String b = "arshita";

        int result = myCompareTo(a, b);

        System.out.println(result);
    }
}