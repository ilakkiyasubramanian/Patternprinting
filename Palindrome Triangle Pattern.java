Palindrome Triangle Pattern


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=0;i<a;i++)
	{
	    for(int j=1;j<=2*(a-i);j++)
	    {
	        System.out.print(" ");
	        
	    }
	    for(int j=i;j>=1;j--)
	    {
	        System.out.print(j+" ");
	    }
	    for(int j=2;j<=i;j++)
	    {
	        System.out.print(j+" ");
	    }
	    System.out.println();
	}
	}
}



          1 
        2 1 2 
      3 2 1 2 3 
    4 3 2 1 2 3 4 
  5 4 3 2 1 2 3 4 5 
6 5 4 3 2 1 2 3 4 5 6 
