import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Student extends Person {
	Scanner keyboard = new Scanner(System.in);
	public int Student_number;

	public String[] introduce = new String[5];
	
	public Student() {
		Person_type = "Student";
	}

	@Override
	public void input_data() {
		System.out.println("input entering time:");
		Entering_time = keyboard.nextLine(); // ��:��:�� �������� �Է����� ������ ���ܸ� �߻���Ű�� defensive coding �ʿ�
		System.out.println("\n");

		System.out.println("input student_number");
		Student_number = keyboard.nextInt();

		/*
		 * fileio function call --> argument:�й� (������ȣ�̹Ƿ� fileio function�� ���ڷ��й��� �����ص� �ɰ�
		 * ����) input_Data�κ��� �Է¹��� �й��� �������� ��� �ؽ�Ʈ���� �й��� �����Ǵ� �̸�,��ȭ��ȣ,���Ǹ���Ʈ�� �Է¹޴´�.
		 */
		if(Fileio(Student_number) == false)
		{
			FirstWindow window = new FirstWindow("error_message");
			window.setVisible(true);
		}
	}

	public boolean Fileio(int new_number)// �Ű������� �й�����.
	{
		/*
		 * �Է¹��� �й��� ���� txt ���Ͽ��� �й��� ��ġ�ϴ� �л��� �����͸� ��� �о�ͼ� ��� ������ ��� �����Ѵ�. [����] 1. �� �پ�
		 * �Է¹޾� ������ �ӽ÷� ������ �����Ѵ� 1-1. �̶� ���Ǵ� ��� ������ ������ŭ�� �����Ѵ�
		 * 
		 * 2. �Է¹��� ������ �й��� �Ű������� �й��� ���ٸ� ��� ������ �Է¹��� ������ �����Ѵ�. 2-2. ���� ������ 3�� �̸��̸� ��������
		 * null�� ä������ -->��) ���� ���Ǹ� 2�� ��� �л��̶�� Lecture_list[2]���� null�� ����ȴ�. (��½� null
		 * �ƴ� ���� ���)
		 * 
		 * 3.flag�� ó�� �Է��� �й��� �����ϴ� ������ text���Ͽ� �����ϴ��� ���θ� ��Ÿ���� �����̴�.
		 *  �� ������ input �Լ����� Ȱ���Ͽ�, flag�� false�� error ȭ���� ����, true�� �й��� �����ϴ� ������ text���Ͽ��� ã�� �����Ѵ�. 
		 */
		String fileName = "Student.txt";
		Scanner inputStream = null;
		boolean flag = false;

		try {
			inputStream = new Scanner(new File(fileName));
			// txt file�� ������ �����ϴ� ù��° ���� �����Ѵ�
			String line = inputStream.nextLine();

			while (inputStream.hasNextLine()) {
				line = inputStream.nextLine();
				String[] data = line.split(","); // ,�� �������� ������ �߶� �����Ѵ�

				int StuNumber = Integer.parseInt(data[0]);
				String name = data[1];
				String Phone = data[2];
				String[] lecture = new String[3];
				for(int i = 3; i < data.length; i++) {
					lecture[i - 3] = data[i]; 
				}
				
				if (Integer.compare(new_number, StuNumber) == 0) // �й��� ��ġ�� ��� ������ ��ü�� member ������ �����Ѵ�
				{
					Name = name;
					phone_number = Phone;
					Lecture_list = lecture;
					
					introduce[0] = Integer.toString(Student_number);
					introduce[1] = name;
					introduce[2] = Phone;
					introduce[3] = Entering_time;
					introduce[4] = Arrays.toString(lecture);
					flag = true;

				}
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find file " + fileName);
		}
		inputStream.close();
		
		if(flag == true)
			return true;
		else
			return false;
	}
	
	

}

