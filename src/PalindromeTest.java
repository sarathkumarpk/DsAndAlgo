

public class PalindromeTest {


    public static final String[] tokens = {
            "MALAYALAM",
            "divider",
            "RADAR",
            "kayak",
            "HINDI",
            "BEACON",
            "divider",
            "canoe",
            "redivider"
    };

    public static void main(String[] args) {

        for (String token : tokens) {
            if (isPalindrome(token)) {
                System.out.println(token + " is a palindrome.");
            } else {
                System.out.println(token + " is not a palindrome.");
            }
        }

    }

    public static boolean isPalindrome(String input) {
        return areMirrorImages(leftOf(input), rightOf(input));
    }

    /**
     * The method recursively divides the left and right images of the String and
     * finally see whether they are mirror images
     * @param left
     * @param right
     * @return
     */
    public static boolean areMirrorImages(String left, String right) {
        /*
         * The base case where string images are single characters and could be compared for
         * just equality.
         */
        if (left.length() == 1 && right.length() == 1) {
            return left.equalsIgnoreCase(right);
        } else {
            /*
             * The recursive case
             */
            return areMirrorImages(leftOf(left), rightOf(right)) && areMirrorImages(rightOf(left), leftOf(right));
        }
    }

    /**
     * This method cut out the left image of the input string
     * @param input
     * @return
     */
    public static String leftOf(String input) {
        return input.substring(0, input.length() / 2);
    }

    /**
     * This method cut out the right image of the input string
     * @param input
     * @return
     */
    public static String rightOf(String input) {
        int beginIndex;
        if (input.length() % 2 == 0) {
            beginIndex = input.length() / 2;
        } else {
            beginIndex = (input.length() / 2) + 1;
        }
        return input.substring(beginIndex);
    }

}


