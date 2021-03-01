class Result
{
  static int max(int a, int b) 
    { 
          return (a > b) ? a : b; 
    }
  static int zeroOneKnapsack(int val[], int weight[], int n, int capacity)
  {
		int i, w;
        int K[][] = new int[n + 1][capacity + 1];
        for (i = 0; i <= n; i++) 
        {
            for (w = 0; w <= capacity; w++) 
            {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (weight[i - 1] <= w)
                    K[i][w]= max(val[i - 1] + K[i - 1][w - weight[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][capacity];
  }
}
