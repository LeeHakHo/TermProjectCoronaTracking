import java.util.Scanner;

public class Outsider extends Person {

	Scanner keyboard = new Scanner(System.in);

	public Outsider() {
		Person_type = "Outsider";
	}

	@Override
	public void input_data() {
		// TODO Auto-generated method stub
		System.out.println("input outsider's name:");
		Name = keyboard.nextLine();
		System.out.println("\n");

		System.out.println("input entering time:");
		Entering_time = keyboard.nextLine(); // ��:��:�� �������� �Է����� ������ ���ܸ� �߻���Ű�� defensive coding �ʿ�
		System.out.println("\n");

		System.out.println("input outsider's phone_number");
		phone_number = keyboard.nextLine();
		/* �ܺ����̹Ƿ� file io�� ���� ������ �Է��� ���ʿ��ϴ�. */
	}

}
