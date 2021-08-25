import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Building vision_Tower = new Building("vision_Tower");
		Building itconvergence = new Building("itconvergence");
		Building Global_center = new Building("Global_center");
		Building Gachon_hall = new Building("Gachon_hall");

		String person_type; // Ȯ���ڸ� �Է��Ͽ� �����ڸ� ����ϴ� 2�� ��忡�� person_type ���� ���� �Է��� �䱸�ϴ� ������ �ٸ��� ����� �� ���δ�.
		int mode; // �ǹ� ������ �Է¸��, Ȯ���� �Է� �� ������ ��� ��带 ������ �� ���δ�.
		int building_select; // �ǹ� ������ �Է¸�忡�� � �ǹ��� �������� �Է��� ������ ������ �� ���δ�.
		int end_bit_vision = 0; // bit = 0 -> �ǹ��� �� ���� ������ �����͸� ������ �� �ִ�. bit = 1 -> �ǹ��� �� ���� ������ �����͸� ������ �� ����.
		int end_bit_it = 0; // ���� ��ġ
		int end_bit_global = 0; // ���� ��ġ
		int end_bit_gachon = 0; // ���� ��ġ
		int unique_number = 0; // Ȯ���� �Է� �� ������ ��� ��忡�� �л� �Ǵ� ������ Ȯ������ ��, �й��� �Է� �޴� ��� ���ȴ�.
		String outsider_phone_number; // Ȯ���� �Է� �� ������ ��� ��忡�� �ܺ����� Ȯ������ ��, �ڵ��� ��ȣ�� �Է� �޴� ��� ���ȴ�.

		while (true) {
			/*
			 * while���� ��� ���۵Ǵ°�?) 1.ó���� 1���� �Է��ϸ�, �ǹ��� �����ϴ� ������� �����͸� �Է��ϴ� ���� �Ѿ��. 1-1.�ǹ���
			 * �����ϴ� ������� �����͸� �Է��ϴ� ���� �Ѿ��, �ǹ��� �����Ǵ� ��ȣ�� �Է��Ѵ�. 1-2.1�� �Է��ϸ�, it ���п� �����ϴ�
			 * ������� �����͸� �Է��ϴ� ���� �Ѿ��. 1-3.it ���п� �����ϴ� ������� �����͸� �Է��ϴ� ���� �Ѿ��, ���� � ������
			 * ����� �ǹ��� �� ������ �Է¹޴´�. 1-4.��� ������ ���ϸ�, ���Ŀ� �µ��� �Է¹޴´�. �µ��� 37.5�� �̻��̸�, �Է��� ����
			 * �ʰ� �ٽ� ��� ������ ���ϴ� â���� �Ѿ��. // �µ��� 37.5�����̸� ���� �߰����� �����͸� �Է¹޴´�.
			 * 
			 * 2.�ǹ��� ��� �����͸� �Է¹޴� ���� ����Ǵ� ���� �ΰ����̴�. ������ �� �ִ� �ִ� �����͸� �Ѵ� ���, ����ڰ� ���������� 3����
			 * ���� �Է��� �����ϴ� ��� 2-1.�ǹ������ʹ� ������ �� �ִ� �ִ� �����͸� �Ѵ� ���, data is full�̶�� ��� �޽�����
			 * ��µȴ�. 2-2.����ڴ� �����͸� �Է¹޴ٰ� 3���� ������ ��� �Է¸�带 �����ϰ�, 2���� ���� Ȯ�������� �Է��Ͽ� �����ڸ� ����� ��
			 * �ִ�.
			 * 
			 * 3.Ȯ���ڸ� ����� ���Ŀ��� �߰������� �����͸� �� �Է¹��� �� �ְ�, �׷��� ���ŵ� �����͸� ���ε� Ȯ���ڿ� ������ ������� ��������
			 * ����� �� �ִ�.
			 * 
			 * 4.3���� ������ ���α׷��� ����ȴ�.
			 */

			System.out.println("��带 �����Ͻÿ� 1�� data �Է�, 2�� Ȯ���� �����Է�, 3�� ����:");
			mode = keyboard.nextInt();

			if (mode == 1) {
				System.out.println("�� �ǹ��� ������ ������� ������ �Է�:\n\n");
				while (true) {
					System.out.println("Building select:1->it����, 2->����Ÿ��, 3->�۷ι�����, 4->��õȦ, 5->����");
					building_select = keyboard.nextInt();

					if (building_select == 1) {
						if (end_bit_it == 0)
							end_bit_it = itconvergence.register_person_in_building();
						else
							System.out.println("Data is full");
					} else if (building_select == 2) {
						if (end_bit_vision == 0)
							end_bit_vision = vision_Tower.register_person_in_building();
						else
							System.out.println("Data is full");
					} else if (building_select == 3) {
						if (end_bit_global == 0)
							Global_center.register_person_in_building();
						else
							System.out.println("Data is full");
					} else if (building_select == 4) {
						if (end_bit_gachon == 0)
							end_bit_gachon = Gachon_hall.register_person_in_building();
						else
							System.out.println("Data is full");
					} else
						break;
				}
			} else if (mode == 2) {
				System.out.println("������ ������ �Է� �ܰ�:\n\n");
				System.out.println("�������� ������ �Է��Ͻÿ�:");

				person_type = keyboard.nextLine();
				person_type = keyboard.nextLine();

				if (person_type.equals("Student")) {
					System.out.println("�й��� �Է��Ͻÿ�:");
					unique_number = keyboard.nextInt();

					/*
					 * 1.����Լ� ȣ�� building�ȿ� �����ϴ� ������ ���� ����Լ��� ���. 2.����Լ��� unique_number �� �й���
					 * ����->building�� ������ ����� �� Ȯ���ڿ� ������ ����� search->���
					 **/
					
					
					
				} else if (person_type.equals("Professor")) {
					System.out.println("�й��� �Է��Ͻÿ�:");
					unique_number = keyboard.nextInt();

					/*
					 * 1.����Լ� ȣ�� building�ȿ� �����ϴ� ������ ���� ����Լ��� ���. 2.����Լ��� unique_number �� �й���
					 * ����->building�� ������ ����� �� Ȯ���ڿ� ������ ����� search->���
					 **/
				} else {
					System.out.println("�ܺ����� ��ȭ��ȣ�� �Է��Ͻÿ�:");
					outsider_phone_number = keyboard.nextLine();

					/*
					 * 1.����Լ� ȣ�� building�ȿ� �����ϴ� ������ ���� ����Լ��� ���. 2.����Լ��� ��ȭ��ȣ�� �Է¹���->building�ȿ� ������
					 * ����� �� Ȯ���ڿ� ������ ����� search->���
					 */
				}
			} else
				break;
		}
		
//		itconvergence.infectedStudent(unique_number);
//		vision_Tower.infectedStudent(unique_number);
//		Global_center.infectedStudent(unique_number);
//		Gachon_hall.infectedStudent(unique_number);
//		
//		
//		vision_Tower.searchTime(unique_number);
//		vision_Tower.searchLecture(unique_number);
//		itconvergence.searchTime(unique_number);
//		itconvergence.searchLecture(unique_number);
//		Global_center.searchTime(unique_number);
//		Global_center.searchLecture(unique_number);
//		Gachon_hall.searchTime(unique_number);
//		Gachon_hall.searchLecture(unique_number);

		// �Էµ� �����Ͱ� �ùٸ��� �� �Է���� Ȯ���ϱ� ���� �뵵�� �ۼ��س����ϴ�.
		/*
		System.out.println("\n\n\n");

		vision_Tower.data_print_out_outsider();
		vision_Tower.data_print_out_professor();
		vision_Tower.data_print_out_student();

		System.out.println("\n\n");

		itconvergence.data_print_out_outsider();
		itconvergence.data_print_out_professor();
		itconvergence.data_print_out_student();

		System.out.println("\n\n");

		Global_center.data_print_out_outsider();
		Global_center.data_print_out_professor();
		Global_center.data_print_out_student();

		System.out.println("\n\n");

		Gachon_hall.data_print_out_outsider();
		Gachon_hall.data_print_out_professor();
		Gachon_hall.data_print_out_student();
		*/

	}

}
