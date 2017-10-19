package org.test;

/**
 * Class containing the "main" method
 * prints Hello world! by default - replace with your code
 *
 */
public class Main 
{
    public  void asd( String[] args )
    {
        //remove the line below and replace with your code.
        String name = System.getenv("CUSTOMER");
        for(int i = 0;i<1000000L;i++){

            try {
                Thread.sleep(1000);
                System.out.println( "The customer is : " + name );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
