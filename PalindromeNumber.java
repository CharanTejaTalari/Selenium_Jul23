package JavaP;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 16462;
		int Org_num = num;
		int rev =0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(Org_num == rev) {
			System.out.println(Org_num + "	is a Palindrome Number");
		}
		else
		{
			System.out.println(Org_num + "	is not a Palindrome Number");
		}
		
		
	}

}
