import java.io.*;
import java.util.*;

public class ContinueDemo {
    public static void main(String[] args) {

        int i, j;

        for( i = 1; i <= 20; i++ )
        {
            if( i % 2 == 0 || i % 3 == 0 ) continue;
            System.out.print( "" + i + " " );
        }
        System.out.println( "" );



        outerloop:
        for( i = 0; i < 10; i++ )
        {
            System.out.println( "" );
            for( j = 0; j < 10; j++ )
            {
                if( i == 8 && j == 8 ) continue outerloop;
                System.out.print( "(" + i + "," + j + ")" );
            }
        }

    }
}