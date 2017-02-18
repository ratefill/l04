package by.epam.l04.example;

public class pLine
{
	private pPoint a;
	private pPoint b;

	public pLine()
	{
		a = null;
		b = null;
	}

	public pLine(pPoint _a, pPoint _b)
	{
		a = _a;
		b = _b;
	}

	public double lineSize()
	{
		double size;
		size = Math.sqrt(Math.pow(Math.abs(a.getX() - b.getX()), 2) + Math.pow(Math.abs(a.getY() - b.getY()), 2));
		return size;
	}

}
