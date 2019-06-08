public class datatypesIncrDecrDemo {
    public static void main(String[] args) {

        int a, b;

        // when increment follows a variable, java will perform the increment after providing the variable's value
        a = 5;
        b = a++;
        System.out.println( "a is: " + a + ", b is: " + b );
        // when increment precedes a variable. Java will perform the increment before providing the variable's value
        a = 5;
        b = ++a;
        System.out.println( "a is: " + a + ", b is: " + b );


    }
}
