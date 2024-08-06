package Lab;

import java.util.HashSet;
import java.util.Set;

public class FriendlySequences {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0};
        int result = count(array);
        System.out.println(result);
    }

    public static int count(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return 0;
        }

        int pairs = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (areFriendly(array[i], array[j])) {
                    pairs++;
                } else {
                    break;
                }
            }
        }

        return pairs;
    }

    public static Set<Character> getSet(String number) {
        Set<Character> digitSet = new HashSet<>();
        
        for (char digit : number.toCharArray()) {
            digitSet.add(digit);
        }
        
        return digitSet;
    }

    public static boolean areFriendly(int num1, int num2) {
        // Convert numbers to strings
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        // Get the digit sets for both numbers
        Set<Character> set1 = getSet(str1);
        Set<Character> set2 = getSet(str2);

        // Compare the digit sets
        return set1.equals(set2);
    }
}
