Zero-One Triangle Pattern


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	for(int i=0;i<a;i++)
	{
	    for(int j=1;j<=i;j++)
	    {
	        if((i+j)%2==0)
	        {System.out.print("1 ");
	            
	        }
	        else{
	            System.out.print("0 ");
	        }
	    }
	    System.out.println();
	}
	}
}



output 

6

1 
0 1 
1 0 1 
0 1 0 1 
1 0 1 0 1 
0 1 0 1 0 1 
