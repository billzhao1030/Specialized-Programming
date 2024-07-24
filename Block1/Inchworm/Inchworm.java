package Block1.Inchworm;
public class Inchworm {
    public static void main(String[] args) {
        int result = lunchtime(1000, 3, 7);
        System.out.println(result);
    }

    public static int lunchtime(int branch, int rest, int leaf) {
        int numEat = 0;

        for (int i = 0; i < branch; i+=leaf) {
            if (i % rest == 0) {
                numEat ++;
            } 
        }

        return numEat;
    }

    public static int lunchtime_with_lcm(int branch, int rest, int leaf) {
        return branch / lcm(rest, leaf) + 1;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
