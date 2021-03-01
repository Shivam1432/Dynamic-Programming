class Result
{
  static int max(int a,int b)
  {
    return a>b?a:b;
  }
  static int zeroOneKnapsack(int val[], int weight[], int n, int capacity)
  {
     if(n==0||capacity==0)
     {
       return 0;
     }
    if(weight[n-1]>capacity)
    {
      return zeroOneKnapsack(val,weight,n-1,capacity);
    }
    else
    {
      return max(val[n-1]+zeroOneKnapsack(val,weight,n-1,capacity-weight[n-1]),
                 zeroOneKnapsack(val,weight,n-1,capacity));
    }
  }
}
