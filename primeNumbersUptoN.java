import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean arr[] = new boolean[n+1];
		Arrays.fill(arr,true);
		arr[0]=false;arr[1]=false;
		for(int i=2;i<=n;i++)
		{
			if(arr[i])
			{
				for(int j=2*i;j<=n;j=j+i)
				arr[j]=false;
			}
		}
		for(int i=0;i<=n;i++)
		{
			if(arr[i])System.out.print(i+" ");
		}

}
