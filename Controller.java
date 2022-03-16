

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Model model = new Model();
		View view = new View();
		
		
		int num1 = view.Input();
		int num2 = view.Input();
		
		
		int addNum = model.add(num1, num2);
		
		
		view.Output(addNum);

	}
}
