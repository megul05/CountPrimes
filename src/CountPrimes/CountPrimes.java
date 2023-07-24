package CountPrimes;

import java.util.*;

public class CountPrimes {
	
	public static int prime(int num)
	{
		int count=0;
		if(num == 0 || num ==1)
		{
			return 0;
		}
		for(int i=2;i<=num/2;i++)
		{
			if(num%2 == 0)
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(prime(num));

	}

}
