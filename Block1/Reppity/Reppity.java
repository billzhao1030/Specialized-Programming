public class Reppity {
    public static void main(String[] args) {
        int result = longestRep("abcdxeakbcdxe222222z222222");
        System.out.println(result);

    }

    public static int longestRep(String input) {
       String longestSub = "";
       int start = 0;
       int end = 1;

       while (end < input.length()) {
           if (input.substring(end).contains(input.substring(start, end))) {
               longestSub = input.substring(start, end);
           } else {
               start++;
           }

           end++;
       }


       return longestSub.length();
   }
}
