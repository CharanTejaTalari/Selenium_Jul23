package JavaP;

public class ReverseANumber {

	public static void main(String[] args) {
		int num = 1234;
		System.out.println("Number: "+num);
		
		
		/*//Logic-1 By using Algorithm
		int rev=0;
		while(num!=0) {
			rev= rev*10 + num%10;
			num= num/10;
		}
		*/
		
		
		/*//Logic-2 By using StringBuffer
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		*/
		
		
		//Logic-3 By using StringBuilder
		StringBuilder sb1 = new StringBuilder();
		StringBuilder rev = sb1.append(num); 
		System.out.println("Number after: "+rev);
	}

}
