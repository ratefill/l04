package by.epam.l04.homework;

/*������� ��������� ���� ������. ���������� ����������� � ������ set(), get(),
show(). ���������� ������������� ����� � ���� ����� ��� ������� ������.
����������� ����� � ���������� ����������. ������ �������� ������ ������ �
������� ��� ������ �� �������.
Student : id, �������, ���, ��������, ���� ��������, �����, �������, ���������,
����.
Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, �����
����������� �����.*/

public class HW01_Human
{

	protected int ID;
	protected String FirstName;
	protected String MiddleName;
	protected String LastName;
	protected String Address;

	public int getID()
	{
		return ID;
	}

	public void setID(int iD)
	{
		ID = iD;
	}

	public String getFirstName()
	{
		return FirstName;
	}

	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}

	public String getMiddleName()
	{
		return MiddleName;
	}

	public void setMiddleName(String middleName)
	{
		MiddleName = middleName;
	}

	public String getLastName()
	{
		return LastName;
	}

	public void setLastName(String lastName)
	{
		LastName = lastName;
	}

	public String getAddress()
	{
		return Address;
	}

	public void setAddress(String address)
	{
		Address = address;
	}

	public void Show()
	{
		System.out.println("ID                " + getID());
		System.out.println("�������           " + getLastName());
		System.out.println("���               " + getFirstName());
		System.out.println("��������          " + getMiddleName());
		System.out.println("�����             " + getAddress());
	}
};
