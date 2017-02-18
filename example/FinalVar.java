package by.epam.l04.example;

import java.util.Date;

public class FinalVar
{
	@SuppressWarnings("unused")
	private final int finalVar;
	public static final int staticFinalVar;
	@SuppressWarnings("unused")
	private final Date date;
	static
	{
		staticFinalVar = 2;
	}
	{
		finalVar = 1;
	}

	public void method(final int var)
	{
	//	final int temp = 12;
		// var++; // error
	//	date.setYear(2999 - 1900);
		// date = new Date(); //error
	}

	public FinalVar()
	{
		// finalVar = 3;//error
		// staticFinalVar = 4;//error
		date = new Date();
	}
}
