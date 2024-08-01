import java.util.Scanner;
public class Main
{
    public static void print(int a)
    {
        int i,j;
        int k=1;
        for(i=1;i<=a;i++)
        {
            /*for(j=1;j<i;j++)
            {
                System.out.print(" ");
            }
            */
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }System.out.println();
        }
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    print(a);
		
	}
}
