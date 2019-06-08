public class DataAndControl {

    public static void main( String[] args ) {
        System.out.println( "Hello, world!" );

        int var1 = 1024;
        int var2;

        var2 = var1 / 2;
        System.out.println( "var1 contains: " + var1 );
        System.out.println( "var2 contains: " + var2 );

        boolean comp, comp2;
        comp = var2 < var1;
        comp2 = var2 > var1;
        System.out.println( "comp contains: " + comp );
        System.out.println( "comp2 contains: " + comp2 );



        int i;
        for( i = 1; i <= 5; i++ )
        {
            System.out.println( i );
        }

        System.out.println( "Next..." );

        int j;
        for( j = 0; j < 5; j++ )
        {
            System.out.println( j );
        }

        System.out.println( "Next..." );
        for( ; j > 0; j-- )
        {
            System.out.println( j );
        }


    }

}

