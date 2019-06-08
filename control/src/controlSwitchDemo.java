public class controlSwitchDemo {
    public static void main(String[] args) {
        int i;
        for( i = 1; i <= 6; i++ )
        {
            switch( i ) {
                case 1:
                    System.out.println( i + " is one.");
                    break;
                case 2:
                    System.out.println( i + " is two.");
                    break;
                case 3:
                case 4:
                    System.out.println( i + " is three or four.");
                    break;
                default:
                    System.out.println( i + " is not between one and four." );
            }
        }

    }
}
