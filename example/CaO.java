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
		System.out.println("Радио включилось");
	}

	void turnOut()
	{
		System.out.println("Радио выключилось");
	}
}
