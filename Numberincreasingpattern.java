public class JavaApplication6 {
    
    public static void  print(int n){
    int i,j;
    for(i=1;i<=n;i++)
    {
    for(j=1;j<=i;j++)
    {
    
    System.out.print(j+ " ");
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


/* output
5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
*/
