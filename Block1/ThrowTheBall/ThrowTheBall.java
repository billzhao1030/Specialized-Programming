public class ThrowTheBall {
    public static void main(String[] args) {
        int result = timesThrown(5,3,2);
        System.out.println(result);
    }
    

    public static int timesThrown(int N, int M, int L) {
        int times = 0;

        // Initialize array and set the first player
        int[] records = new int[N];
        records[0] = 1;

        int current = 0; // current player that hold the ball
        int max = 1; // max record

        while (true) {
            // check end game
            if (max == M) {
                return times;
            }

            // pass the ball and update pass times
            if (records[current] % 2 == 0) {
                current -= L;
                if (current < 0) {
                    current += N;
                }
                current %= N;
            } else {
                current = (current + L) % N;
            }

            records[current] += 1;
            times++;

            // update max record
            if (records[current] > max) { 
                max = records[current];
            }
        }
    }
}