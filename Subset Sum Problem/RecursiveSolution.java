class Result
{
  static int subsetSum(int a[], int n, int sum)
  {
     if(isSubsetSum(a,n,sum)==true)
     {
       return 1;
     }
    else
    {
      return 0;
    }
  }
  static boolean isSubsetSum(int a[],int n,int sum)
  {
    if (sum == 0)
            return true;
        if (n == 0)
            return false;
        if (a[n - 1] > sum)
            return isSubsetSum(a, n - 1, sum);
        return isSubsetSum(a, n - 1, sum) || isSubsetSum(a, n - 1, sum - a[n - 1]);
  }
}
