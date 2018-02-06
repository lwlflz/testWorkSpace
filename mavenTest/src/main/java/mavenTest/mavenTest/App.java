package mavenTest.mavenTest;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	int m = 1024*1024;
    	byte[] b = new byte[2*m];
    	byte[] b2 = new byte[2*m];
    	byte[] b3 = new byte[2*m];
    	byte[] b4 = new byte[2*m];
    	byte[] b5 = new byte[2*m];
    	byte[] b6 = new byte[2*m];
    	byte[] b7 = new byte[2*m];
    	for (int i = 0; i < b5.length; i++) {
    		Thread.sleep(100);
			System.out.println("i="+i);
		}
//    	byte[] b8 = new byte[2*m];
//    	byte[] b9 = new byte[2*m];
//    	byte[] b10 = new byte[2*m];
        
    }
}
