package by.epam.l04.example;

public class CaO
{
	public static void main(String[] args)
	{
		Radio radio = new Radio();
		radio.turnOn();
		radio.turnOut();
	}
}

class Radio
{
	void turnOn()
	{
		System.out.println("����� ����������");
	}

	void turnOut()
	{
		System.out.println("����� �����������");
	}
}
