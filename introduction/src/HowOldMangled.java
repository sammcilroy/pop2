import java.io.*;
import java.util.*;

public class HowOldMangled {

    public static void main( String[] args ) { // a code block is a grouping of code opened and closed with {}

        Scanner in = new Scanner(System.in); // it may contain one or more statements
        int age; // assignment statements, print statements, etc. must be terminated with a ;

        System.out.println( "How old are you?" );

        age = in.nextInt();

        if( age <= 19 )
        { // typically a code block is the target of (e.g.) and if or else statement
            if( age >= 13 )
            {
                System.out.println( "You're a teen." );
                System.out.println( "In " + (20 - age) + " years, you'll be 20." );
            }
            else
                System.out.println( "You're a pre-teen." ); // whitespace is ignored by a Java compiler
            System.out.println( "You're young.");
        }
        else;
        {
            System.out.println( "You're a post-teen." );
        }



    }

}

// a source file .java holds a class definition, the file should match the class name
// we will create classes that contain one or more methods
// a method is a se