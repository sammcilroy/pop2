import java.util.Scanner;

public class Intervals {
    public static void main(String[] args) {

        // read in intervals
        Scanner in = new Scanner( System.in );
        int x1, x2, y1, y2;
        x1 = in.nextInt();
        x2 = in.nextInt();
        y1 = in.nextInt();
        y2 = in.nextInt();

        // intersection
        int i1;
        int i2;

        if (y1 > x2 || y2 < x1) {
            System.out.println("[]"); // empty intersection
        } else if (x1==y1 && x2==y2){
            i1 = x1;
            i2 = x2;
            System.out.println("["+x1+","+x2+"]"); // complete overlap
        } else {
            if (x1 > y1) {
                i1 = x1;
            } else {
                i1 = y1;
            }
            if (x2 < y2) {
                i2 = x2;
            } else {
                i2 = y2;
            }
            System.out.println("["+i1+","+i2+"]");
        }


    }
}
