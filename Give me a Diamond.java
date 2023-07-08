public class Diamond {
    public static String print(int n) {
        if (n % 2 == 0 || n < 0) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();
        int numSpaces = n / 2;
        int numStars = 1;

        // Build upper half of the diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < numSpaces; j++) {
                diamond.append(" ");
            }

            for (int j = 0; j < numStars; j++) {
                diamond.append("*");
            }

            diamond.append("\n");

            if (i < n / 2) {
                numSpaces--;
                numStars += 2;
            } else {
                numSpaces++;
                numStars -= 2;
            }
        }

        return diamond.toString();
    }

    public static void main(String[] args) {
        System.out.println(print(5));
    }
}