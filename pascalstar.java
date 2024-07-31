Pascal Triangle(*)



package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author meila
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    
    public static void print(int a){
    
    int i,j;
    for(i=0;i<a;i++){
    for(j=0;j<a-i;j++)
        
    {
    System.out.print(" ");
    }
    
    for(j=0;j<=i;j++)
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
        print(a);
    }
    
}




8
        * 
       * * 
      * * * 
     * * * * 
    * * * * * 
   * * * * * * 
  * * * * * * * 
 * * * * * * * * 
