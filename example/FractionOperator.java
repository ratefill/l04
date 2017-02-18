package by.epam.l04.example;

public class FractionOperator
{
	public static void main(String[] args)
	{
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(6, 7);
		Fraction c, d, e, f;
		c = a.add(b);
		d = a.sub(b);
		e = a.mul(b);
		f = a.div(b);
		a.printFraction();
		System.out.print(" + ");
		b.printFraction();
		System.out.print("=");
		c.printFraction();
		System.out.println();
		a.printFraction();
		System.out.print(" - ");
		b.printFraction();
		System.out.print("=");
		d.printFraction();
		System.out.println();
		a.printFraction();
		System.out.print(" * ");
		b.printFraction();
		System.out.print("=");
		e.printFraction();
		System.out.println();
		a.printFraction();
		System.out.print(" / ");
		b.printFraction();
		System.out.print("=");
		f.printFraction();
		System.out.println();
	}
}