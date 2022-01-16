import java.util.*;
public class gridTraveler 
{

    public static long gt(long[][] x,int m,int n) {
        if(x[m][n]!=-1)
        {
            return x[m][n];
        }
        if(x[n][m]!=-1)
        {
            return x[n][m];
        }
        else
        {
            long r=gt(x,m-1,n)+gt(x,m,n-1);
            x[m][n]=r;
            return r;
        }
        
    }
    public static void main(String[] args) 
    {
        
        
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        long[][] x=new long[m+1][n+1];

        
        int i,j;
        for(i=0;i<=m;i++)
        {
            for(j=0;j<=n;j++)
            {
                x[i][j]=-1;
            }
        }
        for(i=0;i<=m;i++)
        {
            x[i][0]=0;
            x[i][1]=1;
        }
        for(i=0;i<=n;i++)
        {
            x[0][i]=0;
            x[1][i]=1;
        }

        System.out.println(gt(x,m,n));

    }

    
}
