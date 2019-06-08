import java.util.Scanner;

public class MaximumOfThreeIntegerNumbers {
    public static void main(String[] args) {
        int maximum;
        Scanner in = new Scanner( System.in );

        int int1 = in.nextInt();
        maximum = int1;

        int int2 = in.nextInt();
        if (int2 > maximum) {
            maximum = int2;
        }

        int int3 = in.nextInt();
        if (int3 > maximum) {
            maximum = int3;
        }

        System.out.println(maximum);

    }

}
