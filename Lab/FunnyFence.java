package Lab;

public class FunnyFence {
    public static void main(String[] args) {
        int result = getLength("|||-||--|--|---|-||-|-|-|--||---||-||-||-|--||");
        System.out.println(result);
    }

    public static int getLength(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int end = 1;
        int length = 1;
        int maxLength = 1;

        while (end < s.length()) {
            if (s.charAt(end) != s.charAt(end-1)) {
                length++;
                if (length >= maxLength) {
                    maxLength = length;
                }
            } else {
                length = 1;
            }

            end++;
        }

        return maxLength;
    }
}
