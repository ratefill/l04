package by.epam.l04.homework;

/*������� ��������� ���� ������. ���������� ����������� � ������ set(), get(),
show(). ���������� ������������� ����� � ���� ����� ��� ������� ������.
����������� ����� � ���������� ����������. ������ �������� ������ ������ �
������� ��� ������ �� �������.
Student : id, �������, ���, ��������, ���� ��������, �����, �������, ���������,
����.
Customer: id, �������, ���, ��������, �����, ����� ��������� ��������, �����
����������� �����.*/

public class HW01_Customer extends HW01_Human
{
	private String CreaditCard;
	private String Account;


	public String getCreaditCard()
	{
		return CreaditCard;
	}

	public void setCreaditCard(String creaditCard)
	{
		CreaditCard = creaditCard;
	}

	public String getAccount()
	{
		return Account;
	}

	public void setAccount(String account)
	{
		Account = account;
	}
	
	@Override
	public void Show()
	{
		super.Show();
		System.out.println("��������� �����   " + getCreaditCard());
		System.out.println("���������� ����   " + getAccount());
	}
};
