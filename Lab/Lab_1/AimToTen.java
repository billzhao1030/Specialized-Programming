package Lab.Lab_1;

public class AimToTen {
    public static void main(String[] args) {
        int[] marks = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = need(marks);
        System.out.println(result);
    }

    public static int need(int[] marks) {
        float sumNow = 0;
        for (int i : marks) {
            sumNow += i;
        }
        float average = sumNow / marks.length;

        if (average >= 9.5) {
            return 0;
        }

        int need = 1;
        while (true) {
            float newAverage = (sumNow + 10 * need) / (marks.length + need);

            if (newAverage >= 9.5) {
                return need;
            }
            need++;
        }
    }
}
