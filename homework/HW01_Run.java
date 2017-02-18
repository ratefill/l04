package by.epam.l04.homework;

import java.util.Date;

/*������� ��������� ���� ������. ���������� ����������� � ������ set(), get(),
show(). ���������� ������������� ����� � ���� ����� ��� ������� ������.
����������� ����� � ���������� ����������. ������ �������� ������ ������ �
������� ��� ������ �� �������.
Student : id, �������, ���, ��������, ���� ��������, �����, �������, ���������,
����.
Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, �����
����������� �����.*/

public class HW01_Run
{
	private static final String LineCHAR = "\n**********************************************************\n";

	private HW01_Customer[] Customer;
	private HW01_Student[] Student;
	
	
	public HW01_Run()
	{
		Customer = new HW01_Customer[3];
		Student = new HW01_Student[3];
		createCustomerDB();
		createStudentDB();
	}

	
	private void createCustomerDB()
	{
		HW01_Customer c;

		c = new HW01_Customer();
		c.setID(0);
		c.setFirstName("����");
		c.setMiddleName("����������");
		c.setLastName("�������");
		c.setAddress("������, ������������� 6");
		c.setCreaditCard("1234 1234 5678 5678 6789");
		c.setAccount("VR453489");
		Customer[0] = c;

		c = new HW01_Customer();
		c.setID(1);
		c.setFirstName("���������");
		c.setMiddleName("�����������");
		c.setLastName("�������");
		c.setAddress("�����-���������, ���������� 18");
		c.setCreaditCard("4325 3973 5678 7302 6740");
		c.setAccount("VF256789");
		Customer[1] = c;
		
		c = new HW01_Customer();
		c.setID(2);
		c.setFirstName("��������");
		c.setMiddleName("������������");
		c.setLastName("�����");
		c.setAddress("�����-���������, ��������� 23");
		c.setCreaditCard("1274 3287 1045 3459 1200");
		c.setAccount("VA223473");
		Customer[2] = c;
		

		c = null;

	}	
	
	@SuppressWarnings("deprecation")
	private void createStudentDB()
	{
		HW01_Student c;
	
		c = new HW01_Student();		
		c.setID(0);
		c.setFirstName("����");
		c.setMiddleName("�������������");
		c.setLastName("����������");
		c.setAddress("������, ���������� 26");		

		c.setDateOfBirth(new Date(1986-1900,4,2));
		c.setPhone("+375 29 765 23 49");
		c.setFaculty("���");
		c.setYear((byte)4);
		Student[0] = c;

		c = new HW01_Student();
		c.setID(1);
		c.setFirstName("�������");
		c.setMiddleName("�������������");
		c.setLastName("��������");
		c.setAddress("���������, ����������� ������ 1");
		c.setDateOfBirth(new Date(1946-1900,7,24));		
		c.setPhone("+375 29 365 43 43");
		c.setFaculty("����");
		c.setYear((byte)1);
		Student[1] = c;
		
		c = new HW01_Student();
		c.setID(2);
		c.setFirstName("�����");
		c.setMiddleName("����������");
		c.setLastName("����������");
		c.setAddress("�����, ���������� 8");
		c.setDateOfBirth(new Date(1989-1900,5,23));
		c.setPhone("+375 29 770 51 12");
		c.setFaculty("����");
		c.setYear((byte)3);
		Student[2] = c;
		

		c = null;

	}

	public void Print(int CustomerID)
	{
		Customer[CustomerID].Show();
	}

	public HW01_Customer findCustomerByID(int CustomerID)
	{
		HW01_Customer result = null;
		for (int i = 0; i < Customer.length; i++)
		{
			if (Customer[i].getID() == CustomerID)
			{
				result = Customer[i];
				break;
			}

		}
		return result;
	}
	
	public HW01_Student findStudentByID(int StudentID)
	{
		HW01_Student result = null;
		for (int i = 0; i < Student.length; i++)
		{
			if (Student[i].getID() == StudentID)
			{
				result = Student[i];
				break;
			}

		}
		return result;
	}	
	

	public static void main(String[] args)
	{
		HW01_Run run = new HW01_Run();
		System.out.println(LineCHAR);
		run.Print(0);
		System.out.println(LineCHAR);
		run.findCustomerByID(1).Show();
		System.out.println(LineCHAR);
		run.findStudentByID(2).Show();
		System.out.println(LineCHAR);
	}
};
