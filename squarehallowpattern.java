import java.util.Scanner;

public class JavaApplication6 {
    
    public static void  print(int n){
    int i,j;
    for(i=0;i<n;i++)
    {
    for(j=0;j<n;j++)
    {
    if(i==0 ||  j==0 || i==n-1 || j==n-1)
    {
    
    System.out.print("* ");
    }
    else
    {
    System.out.print("  ");
    }
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
