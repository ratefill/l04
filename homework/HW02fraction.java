package by.epam.l04.homework;

import java.util.Random;

/*ќпределить класс Ђƒробьї в виде пары m/n. ќбъ€вить массив из k дробей,
ввести/вывести значени€ дл€ массива дробей.*/

public class HW02fraction
{
	private static final int k = 10;
	private static Fraction[] ar;

	public static void main(String[] args)
	{
		ar = new Fraction[k];
		gen();
		show();
	}

	private static void gen()
	{
		final Random random = new Random();

		for (int i = 0; i < k; i++)
		{
			ar[i] = new Fraction(random.nextInt(100), random.nextInt(100));
		}
	}

	private static void show()
	{
		for (int i = 0; i < k; i++)
		{
			ar[i].print();			
		}
	}

};

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////

class Fraction
{
	private int numerator;// m;
	private int denominator;// n;

	public int getNumerator()
	{
		return numerator;
	}

	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}

	public int getDenominator()
	{
		return denominator;
	}

	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}

	public Fraction(int numerator, int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);
	}

	public void print()
	{
		System.out.println(getNumerator() + "/" + getDenominator());
	}

}
