**Number Triangular***


import java.util.Scanner;
public class Main
{
    public static void print(int a)
    {
        int i,j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=a-i;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }System.out.println();
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    print(a);
		
	}
}



output

