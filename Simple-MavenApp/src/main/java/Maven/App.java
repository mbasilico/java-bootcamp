package Maven;

import java.util.Scanner;

/**
 * Hello Name!
 *
 */

public class App 
{	
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		String name;
        System.out.println( "Write your name:" );
	name = sc.nextLine();
	 System.out.println( "Hello " + name );
    }
}
