import java.util.Scanner;

public class MyMain {

    // Generates a random number between 10 and 20, inclusive
    public static int randomTeen() {
    int x = (int)(Math.random()*10);
    int y = x + 11;
        return y;
    }

    // Use your previous method to generate three random numbers between 10 and 20, inclusive.
    // Your program should print out the three numbers, as well as the largest and smallest
    // values of the three.
    // Example of running your code:
    // The three random numbers are 20, 14, and 10
    // The largest number is 20
    // The smallest number is 10
    public static void main(String[] args) {
        int x = randomTeen();
        int y = randomTeen();
        int z = randomTeen();

        System.out.println(x + " " + y + " " + z);
        System.out.println(Mathey.max(Mathey.max(x, y), z));
        System.out.println(Mathey.max(x, y, z));
        System.out.println(Math.min(Mathey.max(x, y), z));


//         // Uncomment this code later!
        System.out.println("Mathey.max tests");
        System.out.println(Mathey.max(1, 2)); // 2
        System.out.println(Mathey.max(2, 1)); // 2

        System.out.println(Mathey.max(1.5, 2.5)); // 2.5
        System.out.println(Mathey.max(2.5, 1.5)); // 2.5

        System.out.println(Mathey.max(1, 2, 3)); // 3
        System.out.println(Mathey.max(2, 1, 3)); // 3
        System.out.println(Mathey.max(3, 2, 1)); // 3

        System.out.println(Mathey.max(1.5, 2.5, 3.5, 4.5)); // 4.5
        System.out.println(Mathey.max(2.5, 1.5, 3.5, 4.5)); // 4.5
        System.out.println(Mathey.max(4.5, 2.5, 1.5, 3.5)); // 4.5

        System.out.println(Mathey.random_int(1, 5)); // 1-5
        System.out.println(Mathey.random_int(4, 8)); // 4-8
        System.out.println(Mathey.random_int(6, 20)); // 6-20

        System.out.println(Mathey.random_int(6)); // 0-6
        System.out.println(Mathey.random_int( 20)); // 0-20
        System.out.println(Mathey.random_int(40)); // 0-40

    }


}


