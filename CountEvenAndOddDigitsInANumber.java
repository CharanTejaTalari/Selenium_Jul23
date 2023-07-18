package JavaP;

public class CountEvenAndOddDigitsInANumber {

	public static void main(String[] args) {
		int num = 1234;
		int Even_num = 0;
		int Odd_Num = 0;
		
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				Even_num++;
			}else {
				Odd_Num++;
			}
			num=num/10;
		}
		System.out.println("Even Number Count is : "+Even_num);
		System.out.println("Even Number Count is : "+Odd_Num);
	}

}
