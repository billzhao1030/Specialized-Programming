public class RugSizes {
    public static void main(String[] args) {
        int result = rugCount(36);
        System.out.println(result);
    }

    public static int rugCount(int area) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(area); i++) {
            if (area % i == 0) { 
                int r = area / i;
                if (i % 2 == 0 && r % 2 == 0 && i != r) {
                    continue;
                }

                count++;
            }
        }

        return count;
    }
}