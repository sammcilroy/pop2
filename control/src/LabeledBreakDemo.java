import java.io.*;
import java.util.*;

public class LabeledBreakDemo {
    public static void main(String[] args) {
        int i;


        for( i = 1; i <= 4; i++ )
        {
            one:        {
                two:            {
                    System.out.println( "\ni is: " + i );
                    if( i == 1 ) break one;
                    if( i == 2 ) break two;
                    if( i == 3 ) break;
                }
                System.out.println( "After block two." );
            }
            System.out.println( "After block one." );
        }
        System.out.println( "After for." );



    }
}