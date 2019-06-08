import java.util.*;

public class datatypesArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<String>();
        friends.add( "Bart" );
        friends.add( "Lisa" );
        friends.add( "Marge" );

        System.out.println( "Friends:" );
        for( int i = 0; i < friends.size(); i++ )
        {
            System.out.println( friends.get(i) );
        }

        friends.add(0, "Homer" );
        friends.remove(3);

        System.out.println( "Friends:" );
        for( int i = 0; i < friends.size(); i++ )
        {
            System.out.println( friends.get(i) );
        }
    }
}
