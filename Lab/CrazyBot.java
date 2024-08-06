package Lab;
import java.util.HashSet;
import java.util.Set;

public class CrazyBot {
    public static void main(String[] args) {
        double result = getProbabiliy(14, 25, 25, 25, 25);
        System.out.println(result);
    }

    public static double move(int x, int y, int n, int east, int west, int south, int north, Set<String> visited) {
        if (visited.contains(x + "," + y)) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        
        visited.add(x + "," + y);
        double probability = 0;
        int[][] movement = {{1, 0, east}, {-1, 0, west}, {0, 1, north}, {0, -1, south}};

        for (int i = 0; i < movement.length; i++) {
            int dx = movement[i][0];
            int dy = movement[i][1];
            double prob = movement[i][2];
            
            if (prob > 0) {
                probability += prob / 100 * move(x + dx, y + dy, n-1, east, west, south, north, visited);
            }
        }

        visited.remove(x + "," + y);

        return probability;
    }

    public static double getProbabiliy(int n, int east, int west, int south, int north) {
        Set<String> visited = new HashSet<>();
        
        return move(0, 0, n, east, west, south, north, visited);
    }
}
