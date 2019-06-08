public class IfDemo {
    public static void main(String[] args) {

        for( int i = 1; i <= 10; i++ )
        {
            if( i != 7 )
            {
                if( i == 5 ) System.out.println( i + " is equal to 5.");
                if( i < 5 ) System.out.println( i + " is strictly less than 5.");
                else System.out.println( i + " is not strictly less than 5." );
                // this else is associated with if( i < 5 )
            }
            else // this else is associated with if( i != 7 )
            {
                System.out.println( "Lucky 7!");
            }
        }
    }
}
