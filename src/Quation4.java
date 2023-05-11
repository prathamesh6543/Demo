// Design method int fact orial(int no)  which returns int value to that method. 
//print the results into main method (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)

public class Quation4 {
	int factorial(int number) {
		int fact = 1;
		for (int i = 1 ; i <= number; i ++) {
			fact = fact * i;
		}
		return fact;
	} 
	public static void main (String[]args) {
		Quation4 quation4=new Quation4 ();
		int result = quation4.factorial(5);
		System.out.println(result);
	}
	

}
