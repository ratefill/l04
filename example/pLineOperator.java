package by.epam.l04.example;

public class pLineOperator
{
	public static void main(String[] args)
	{
		pPoint A = new pPoint(1, 1);
		pPoint B = new pPoint(2, 2);
		pLine mypoint = new pLine(A, B);
		A = B = null;
		System.out.println("|A-B|=" + mypoint.lineSize());
	}
}
