package by.epam.l04.example;

public class Salary
{
	private double baseSalary;
	public static double increaseCoeffitient = 1.5;

	public Salary(double baseSalary)
	{

		if (baseSalary <= 0)
		{
			this.baseSalary = 100;
		}
		else
		{
			this.baseSalary = baseSalary;
		}
	}

	public double calcSalary()
	{
		return baseSalary * increaseCoeffitient;
	}
}