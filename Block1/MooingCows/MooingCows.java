import java.util.ArrayList;

public class MooingCows {
    public static void main(String[] args) {
        String[] farmland =   {"CCC....",
                            "C......",
                            "....C.C",
                            ".C.CC..",
                            "C......"};
        int result = dissatisfaction(farmland);
        System.out.println(result);
    }

    // public static int dissatisfaction(String[] farmland) {
    //     int minimum = Integer.MAX_VALUE;
    //     int dissatisfy = 0;
    //     for (int x = 0; x < farmland.length; x++) {
    //         for (int y = 0; y < farmland[x].length(); y++) {
    //             if (farmland[x].charAt(y) != 'C') {
    //                 continue;
    //             }
                
    //             // target it's a C
    //             for (int i = 0; i < farmland.length; i++) {
    //                 for (int j = 0; j < farmland[x].length(); j++) {
    //                     if (farmland[i].charAt(j) != 'C') {
    //                         continue;
    //                     }

    //                     int distance = (int) (Math.pow(x-i, 2) + Math.pow(y-j, 2));
    //                     dissatisfy += distance;
    //                 }
    //             }
                
    //             // update minimum
    //             if (dissatisfy < minimum) {
    //                 minimum = dissatisfy;
    //             }

    //             // reset dissatisfy
    //             dissatisfy = 0;
    //         }
    //     }

    //     return minimum;
    // }

    public static int dissatisfaction(String[] farmland) {
        int minimum = Integer.MAX_VALUE;
        int dissatisfy = 0;
        ArrayList<int[]> locations = new ArrayList<>();

        for (int i = 0; i < farmland.length; i++) {
            for (int j = 0; j < farmland[i].length(); j++) {
                if (farmland[i].charAt(j) == 'C') {
                    int[] axis = {i, j}; 
                    locations.add(axis);
                }
            }
        }

        for (int[] l1: locations) {
            for (int[] l2: locations) {
                int distance = (int) (Math.pow(l1[0]-l2[0], 2) + Math.pow(l1[1]-l2[1], 2));
                dissatisfy += distance;
            }

            // update minimum
            if (dissatisfy < minimum) {
                minimum = dissatisfy;
            }

            // reset dissatisfy
            dissatisfy = 0;
        }

        return minimum;
    }


}