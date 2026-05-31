public class CompareTo {

    static void thisis(String a, String b) {

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {

            if (a.charAt(i) != b.charAt(i)) {

                int diff = Math.abs(a.charAt(i) - b.charAt(i));

                System.out.println(
                        a.charAt(i) + " and " + b.charAt(i) +
                                " diff = " + diff);
            }
        }
    }

    public static void main(String[] args) {

        String a = "saghav";
        String b = "reet";

        thisis(a, b);
    }
}