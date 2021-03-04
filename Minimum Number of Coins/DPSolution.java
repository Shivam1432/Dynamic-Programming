class Result
{
  static int minCoins(int coins[], int n, int sum)
  {
		int table[] = new int[sum + 1];
        table[0] = 0;
        for (int i = 1; i <= sum; i++)
        table[i] = Integer.MAX_VALUE;
        for (int i = 1; i <= sum; i++)
        {
            for (int j = 0; j < n; j++)
            if (coins[j] <= i)
            {
                int sub_res = table[i - coins[j]];
                if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                       table[i] = sub_res + 1;
            }  
        }
          if(table[sum]==Integer.MAX_VALUE)
            return -1;
        return table[sum];
  }
}
