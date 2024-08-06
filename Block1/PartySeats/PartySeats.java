
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PartySeats {
    public static void main(String[] args) {
        String[] attendees = {"BOB boy","SUZIE girl","DAVE boy","JO girl",
        "AL boy","BOB boy","CARLA girl","DEBBIE girl"};
        String[] results = seating(attendees);
        System.out.println(Arrays.toString(results));
    }

    public static String[] seating(String[] attendees) {
        if (attendees.length % 4 != 0) {
            return new String[]{};
        }

        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();

        for (String s: attendees) {
            String name = s.split(" ")[0];
            String gender = s.split(" ")[1];

            if (gender.equals("boy")) {
                boys.add(name);
            } else {
                girls.add(name);
            }
        }

        if (boys.size() != girls.size()) {
            return new String[]{};
        }

        Collections.sort(boys);
        Collections.sort(girls);

        String[] seats = new String[attendees.length + 2];
        
        seats[0] = "HOST";
        seats[attendees.length / 2 + 1] = "HOSTESS";

        for (int i = 0; i < boys.size() / 2; i++) {
            seats[2*i+1] = girls.get(i);
            seats[2*i+2] = boys.get(i);
        }

        for (int i = boys.size() / 2; i < boys.size(); i++) {
            seats[2*i+2] = boys.get(i);
            seats[2*i+3] = girls.get(i);
        }

        return seats;

    }
}