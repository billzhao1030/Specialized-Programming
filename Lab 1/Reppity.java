public class Reppity {
    public static void main(String[] args) {
        int result = longestRep("abcdabcdabcdabCD");
        System.out.println(result);
    }

    public static int longestRep(String input) {
        String longestSub = "";
        int start = 0;
        int end = 1;

        while (end <= input.length() / 2) {
            if (input.substring(end).contains(input.subSequence(start, end))) {
                longestSub = (String) input.subSequence(start, end);
            } else {
                start++; 
            } 

            end++;
        }
        
        return longestSub.length();
    }
}
