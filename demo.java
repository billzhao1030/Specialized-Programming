public class demo {
    public static void main(String[] args) {
        String ss = getString();
        System.out.println(ss);

        Wife w = new Wife();
        System.out.println(w.age);

        w.setAge(23);
        System.out.println(w.age);

        System.out.println("I love you wife");

        int age = 21;
        System.out.println(age);

        if (age < 22) {
            System.out.println("Little bubu");
        } else if (age == 22) {
            System.out.println("Meet husband");
        } else {
            System.out.println("Married");
        }

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i : array) {
            System.out.println(i);
        }

        int little_bubu_age = 0;
        double price = 3.9;
        
        while (little_bubu_age < 5) {
            System.out.printf("age: %d, price: %f still tiny\n", age, price); // d-integer, f-float, s=string
            little_bubu_age++;
        }
        System.out.println("ah oh, bubu big");

        char alpha = 's';
        String name = "linh";
        System.out.println(name.charAt(1)); // name[1]
        System.out.println(alpha);
    }

    public static String getString() {
        return "safdhak";
    }
}

class Wife {
    int age = 10;
    public void setAge(int age) {
        this.age = age;
    }

    public static int hug() {
        System.out.println("hug hug");
        return 10;
    }
}
