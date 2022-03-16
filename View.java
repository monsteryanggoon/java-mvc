import java.util.Scanner;

public class View {
	private Scanner in = null;
	
	View() {
		in = new Scanner(System.in);
	}
	
	int Input() {
		System.out.println("Input Number..: ");
		return in.nextInt();
	}
	
	
	void Output(int value) {
		System.out.println("---------------------------------------------");
		System.out.println("Add value is " + value);
		System.out.println("---------------------------------------------");
	}
}
