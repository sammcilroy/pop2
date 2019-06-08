// Write a program that, given a number of seconds n, prints the number of hours, minutes and seconds

import java.io.*;
import java.util.Scanner;

public class TimeDecomposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hours = n/3600;
        int minutes = (n/60) - (hours*60);
        int seconds = n % 60;
        System.out.println(hours + " " + minutes + " " + seconds);
    }
}
