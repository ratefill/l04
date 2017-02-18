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

public class HW01_Student extends HW01_Human
{
	protected Date DateOfBirth;
	protected String Phone;
	protected String Faculty;
	protected byte Year;
	
	public Date getDateOfBirth()
	{
		return DateOfBirth;
	}
	public void setDateOfBirth(Date DateOfBirth)
	{
		this.DateOfBirth = DateOfBirth;
	}
	public String getPhone()
	{
		return Phone;
	}
	public void setPhone(String Phone)
	{
		this.Phone = Phone;
	}
	public String getFaculty()
	{
		return Faculty;
	}
	public void setFaculty(String Faculty)
	{
		this.Faculty = Faculty;
	}
	public byte getYear()
	{
		return Year;
	}
	public void setYear(byte i)
	{
		this.Year = i;
	}

	@Override
	public void Show()
	{
		super.Show();
		System.out.println("���� ��������   " + getDateOfBirth());
		System.out.println("�������   " + getPhone());
		System.out.println("��������� � ���� " + getFaculty()+", "+getYear()+" ����");
	}
};
