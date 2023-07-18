package JavaP;

public class FindLargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=10, b=20, c=30;
		
		/*if(a>b & a>c) {System.out.println("a having Largest value");}else
			if(b>a & b>c) {System.out.println("b having Largest value");}else
			{System.out.println("c having Largest value");}
		*/
		
		//By using ternary
		/*int largest1 = a>b?a:b;
		int largest2 = largest1>c?largest1:c;
		*/
		
		int largest = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest + " is largest");
	}

}
