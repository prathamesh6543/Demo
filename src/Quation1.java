// print 25 to 50 number usign while loop

public class Quation1 {
	public static void main (String[]args) {
		int number = 2;
		while (number <=20) {
			for (int a = 1 ; a <= 10; a++) {
				int c = a * number;
				System.out.println(number  + "*" + a +  "=" + c);
			}
			number++;
		}
	}
}
