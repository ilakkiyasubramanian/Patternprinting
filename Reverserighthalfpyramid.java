package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {
    
    public static void  print(int n){
    int i,j;
    for(i=1;i<=n;i++)
    {
    for(j=i;j<=n;j++)
    {
    
    System.out.print("*");
    }
    System.out.println();
    
    }
        

    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
    
}

/*
Solution
*****
****
***
**
*

*/
