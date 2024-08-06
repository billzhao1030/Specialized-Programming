import java.util.ArrayList;
import java.util.Collections;

public class ChangingString {
    public static void main(String[] args) {
        int result = distance( "aab", "aac", 2);
        System.out.println(result);
    }

    public static int distance(String A, String B, int K) {
        ArrayList<Integer> differences = new ArrayList<>();
        int sum = 0;
        int nonZero = 0;

        for (int i = 0; i < A.length(); i++) {
            int difference = Math.abs(A.charAt(i) - B.charAt(i));
            differences.add(difference);

            // check force change case
            if (difference != 0) {
                nonZero++;
            }
        }

        Collections.sort(differences);
        for (int i = 0; i < differences.size() - K; i++) {
            sum += differences.get(i);
        }

        if (K > nonZero) {
            sum += K - nonZero;
        }

        return sum;
    }
}