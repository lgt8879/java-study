package syntax;

public class WhileExam {

	public static void main(String[] args) {
		int num = 4;
		while (num > 5) {
			num++;
		}

		do {
			System.out.println(num);
			num++;
		} while (num > 5);
	}
}
