package by.epam.l04.example;

public class Fraction
{
	private int numerator; // числитель
	private int denominator; // знаменатель

	public Fraction()
	{
		numerator = denominator = 1;
	}

	public Fraction(int num, int den)
	{
		numerator = num;
		denominator = den;
	}

	public Fraction add(Fraction x)
	{
		Fraction tempFraction = new Fraction(numerator * x.denominator + denominator * x.numerator,
				denominator * x.denominator);
		tempFraction.reduceFraction();
		return tempFraction;
	}

	// вычитание дробей
	public Fraction sub(Fraction x)
	{
		Fraction tempFraction = new Fraction(numerator * x.denominator - denominator * x.numerator,
				denominator * x.denominator);
		tempFraction.reduceFraction();
		return tempFraction;
	}

	// умножение дробей
	public Fraction mul(Fraction x)
	{

		Fraction tempFraction = new Fraction(numerator * x.numerator, denominator * x.denominator);
		tempFraction.reduceFraction();
		return tempFraction;
	}

	// деление дробей
	public Fraction div(Fraction x)
	{
		Fraction tempFraction = new Fraction(numerator * x.denominator, denominator * x.numerator);
		tempFraction.reduceFraction();
		return tempFraction;
	}

	// сокращение дроби
	private void reduceFraction()
	{
		int nod;
		//int max;
		if (Math.abs(numerator) < Math.abs(denominator))
		{
			nod = Math.abs(numerator);
		}
		else
		{
			nod = Math.abs(denominator);
		}
		while (true)
		{
			if (((numerator % nod) == 0) && ((denominator % nod) == 0))
				break;
			nod--;
		}
		numerator = numerator / nod;
		denominator = denominator / nod;
	}

	public void printFraction()
	{
		System.out.print(numerator + "/" + denominator);
	}
}
