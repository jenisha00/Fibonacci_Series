
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Jenisha Munikar
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        int a=0,b=1,c=1,n;
        
        System.out.println("Enter the number of terms:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+"\t");
            c=a+b;
            a=b;
            b=c;
            
        }
    }
    
}
