import java.util.Scanner;

public class AddOneSecond {

    public static void main(String[] args) {

        // read in hours minutes seconds
        Scanner in = new Scanner( System.in );
        int h, m, s;
        h = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();

        // add one second to the time
        if (s == 59) {
            s = 0;
            m ++;
            if (m > 59) {
                m = 0;
            }
        } else {
            s ++;
        }

        // increase the hour if needed
        if (m == 0 && s==0) {
            h ++;
        }
        if (h > 23) {
            h = 0;
        }



        // format time, deal with leading zeroes in integers < 10
        String hour;
        String minute;
        String second;
        if (h < 10) {
            hour = "0"+Integer.toString(h);
        } else {hour = Integer.toString(h);}

        if (m < 10) {
            minute = "0"+Integer.toString(m);
        } else {minute = Integer.toString(m);}

        if (s < 10) {
            second = "0"+Integer.toString(s);
        } else {second = Integer.toString(s);}


        // print the new time
        System.out.println(hour+":"+minute+":"+second);
    }

}
