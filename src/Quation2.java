import java.util.Scanner;

//Design method void multiplication (int no) and print the multiplication table. ( Example enter the no=5 then output like 
//5*1=5.......5*10=50)

public class Quation2 {
	void multiplication (int no) {
		for (int i = 1; i<=10;i++) {
			int m = no *i;
			System.out.println (no + "*" + i + "=" + m);
		}
		
	}
	public static void main (String[]args) {
		System.out.println("The number is ");
		Scanner scanner=new Scanner (System.in);
		int a = scanner.nextInt();
		Quation2 quation2=new Quation2 ();
		quation2.multiplication(a);
 
	}

}
