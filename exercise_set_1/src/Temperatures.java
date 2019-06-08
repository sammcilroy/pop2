import java.util.Scanner;

public class Temperatures {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );
        int temperature = in.nextInt();

        if (temperature > 30) {
            System.out.println("it's hot");
            if (temperature >= 100) {
                System.out.println("water would boil");
            }
        } else if (temperature < 10) {
            System.out.println("it's cold");
            if (temperature <= 0) {
                System.out.println("water would freeze");
            }
        } else {
            System.out.println("it's ok");
        }

    }
}
