package by.epam.l04.example;

public class SalaryWithWrongStatic
{
	private double baseSalary;
	public static double increaseCoeffitient = 1.5;

	public SalaryWithWrongStatic(double baseSalary)
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

	public static void setIncreaseCoeffitient(double newIncreaseCoeffitient)
	{
		if (newIncreaseCoeffitient <= 0)
		{
			throw new IllegalArgumentException("Wrong parameter: newIncreaseCoeffitient = " + newIncreaseCoeffitient);
		}
		increaseCoeffitient = newIncreaseCoeffitient;
		// calcSalary(); // ERROR
	}
}
