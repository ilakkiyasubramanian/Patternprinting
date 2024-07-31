
Right Pascal’s Triangle


package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author meila
 */
public class JavaApplication8 {

    public static void call(int a){
        int i,j;
        for(i=0;i<=a;i++)
        {
            for(j=0;j<i;j++)
            {
            System.out.print("* ");
            }
            System.out.println();
            
        }
        for(i=0;i<=a;i++)
        {
            for(j=a;j>=i;j--)
            {
            System.out.print("* ");
            }
            System.out.println();
        }
        
    
        }
   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        call(a);
    }
    
}




output

4

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
