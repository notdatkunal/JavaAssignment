import java.util.Scanner;

public class Pattern56 {
	public static void main(String[] args) {
		int i, j, length;
		Scanner in = new Scanner(System.in);
		System.out.println("enter your length");
		length = in.nextInt() + 1;
		char a = 'a';
		int b = 1;
		char c = (char) (b + '0');
		char d = (char) (b + '1');
		for (i = 0; i <= length; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = length - i; j != 0; j--) {

				System.out.print(c);
			}
			c = (i % 2 == 0 ? a++ : d++);
			System.out.println();
		}
	}
}
