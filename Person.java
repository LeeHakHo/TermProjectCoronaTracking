import java.util.Arrays;

abstract public class Person {
	public String phone_number;
	public String Name;
	public String[] Lecture_list = new String[3]; // ���� ���� 3���� ���� �ǹ����� ��� ��� ���� �����Ƿ�, list�� �ִ� �����ʹ� �� 3���� �����Ͽ���.
	public String Person_type;
	public String Entering_time; // ��:��:�� ����
	public String studentNumber;
	

	abstract public void input_data();

	public String get_phone_number() {
		return phone_number;
	}

	public String get_Name() {
		return Name;
	}

	public String get_person_type() {
		return Person_type;
	}

	public String[] get_lecture_list() {
		return Lecture_list;
	}

}

