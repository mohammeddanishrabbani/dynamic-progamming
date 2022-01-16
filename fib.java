import java.util.*;
class fib
{

    public static long f(long[] a,int n)
    {
        if(a[n]!=-1)
        {
            return a[n];
        }
        else
        {
            long b=f(a,n-1)+f(a,n-2);
            a[n]=b;
            return b;
        }
    }
    public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] a=new long[n+1];
        Arrays.fill(a,-1);
        a[1]=1;
        a[2]=1;

        System.out.println(f(a,n));


        
        
    }
}