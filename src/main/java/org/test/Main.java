package org.test;

/**
 * Class containing the "main" method
 * prints Hello world! by default - replace with your code
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        //remove the line below and replace with your code.
        String name = System.getenv("CUSTOMER");
        System.out.println( "The customer is : " + name );
    }
}
