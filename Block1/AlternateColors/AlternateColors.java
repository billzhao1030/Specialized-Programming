public class AlternateColors {
    public static void main(String[] args) {
        String result = getColor(1,1,1,1);
        System.out.println(result);
    }

    public static String getColor(long r, long g, long b, long k) {
        long fullCycles = k / 3;
        long remainder = k % 3;

        // Reduce the number of balls by the full cycles
        r -= Math.min(r, fullCycles);
        g -= Math.min(g, fullCycles);
        b -= Math.min(b, fullCycles);

        // Determine the color of the k-th ball based on the remainder
        if (remainder == 1) {
            if (r > 0) return "RED";
            if (g > 0) return "GREEN";
            if (b > 0) return "BLUE";
        } else if (remainder == 2) {
            if (r > 0 && g > 0) return "GREEN";
            if (r > 0 || g > 0) return r > 0 ? "RED" : "BLUE";
            return "BLUE";
        } else { // remainder == 0
            if (r > 0 && g > 0 && b > 0) return "BLUE";
            if (r > 0 && g > 0) return "GREEN";
            if (r > 0 || g > 0) return r > 0 ? "RED" : "GREEN";
            return "BLUE";
        }
        return null;
    }
}
