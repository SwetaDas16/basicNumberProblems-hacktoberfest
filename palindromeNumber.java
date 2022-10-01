

public class PallindromeNumber {
	
	public static void main(String[] args) {
		int num = 50;
		int temp = num;
		int rev=0;
		
		while (num>0) 	{
			int lastdigit = num%10;
			rev= rev*10 + lastdigit;
			num=num/10;
		}
	
		if (rev== temp) {
		System.out.print("The number is a pallindrome.");
		}
		else {
			System.out.print("The number is not a pallindrome.");
		}
	}
}
