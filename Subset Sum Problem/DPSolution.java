import java.util.*;
class Result{
 static int subsetSum(int a[], int n, int sum)
{
  if(issubsetSum(a,n,sum)==true)
  {
    return 1;
  }
  else{
    return 0;
  }
}
static boolean issubsetSum(int[] a,int n,int sum)
{
  boolean[][] subset=new boolean[sum+1][n+1];
  for(int i=0;i<=n;i++)
  {
    subset[0][i]=true;
  }
  for(int i=1;i<=sum;i++)
  {
    subset[i][0]=false;
  }
  for(int i=1;i<=sum;i++)
  {
    for(int j=1;j<=n;j++)
    {
      subset[i][j]=subset[i][j-1];
      if(i>=a[j-1])
      {
        subset[i][j]=subset[i][j]||subset[i-a[j-1]][j-1];
      }
    }
  }
  return subset[sum][n];
}
}
