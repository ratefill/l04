package by.epam.l04.homework;

import java.util.Random;

/*Имеется список абитуриентов (класс Abiturient) и список оценок, полученных ими на
вступительных экзаменах. Напечатать список поступивших, если число мест меньше
числа абитуриентов.*/

public class HW04exams
{
	public static void main(String[] args)
	{
		AbiturientList al = new AbiturientList(90, 20);
		//al.printall();
		al.examresults();
	}
}


/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////




class AbiturientList
{

	private int n;
	private int capacity;
	private Abiturient[] list;

	public int getN()
	{
		return n;
	}

	public void setN(int n)
	{
		this.n = n;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}

	public AbiturientList(int n, int capacity)
	{
		super();

		final Random random = new Random();
		this.n = n;
		this.capacity = capacity;

		list = new Abiturient[n];

		int mark1;
		int mark2;
		int mark3;
		int mark4;

		for (int i = 0; i < n; i++)
		{
			mark1 = random.nextInt(10) + 1;
			mark2 = random.nextInt(10) + 1;
			mark3 = random.nextInt(10) + 1;
			mark4 = random.nextInt(10) + 1;
			list[i] = new Abiturient(i, mark1, mark2, mark3, mark4);
		}
	}

	public void examresults()
	{
		Abiturient[] students;

		if (capacity >= n)
		{
			students = list.clone();

		}
		else
		{
			// пузырек
			for (int i = list.length - 1; i > 0; i--)
			{
				for (int j = 0; j < i; j++)
				{

					if (list[j].avg() < list[j + 1].avg())
					{
						Abiturient tmp = list[j];
						list[j] = list[j + 1];
						list[j + 1] = tmp;
					}
				}
			}
		}

		students = new Abiturient[capacity];

		for (int i = 0; i < capacity; i++)
		{
			students[i] = list[i];
		}
		System.out.println();
		System.out.println("Список зачисленных:");
		for (int i = 0; i < capacity; i++)
		{
			System.out.print("Студент ID=" + students[i].getId() + ", ср. балл=" + students[i].avg());
			System.out.println();
			;
		}
	}

	public void printall()
	{
		System.out.println();
		System.out.println("Список всех студентов");
		for (int i = 0; i < capacity; i++)
		{
			System.out.print("Студент ID=" + list[i].getId() + ", ср. балл=" + list[i].avg());
			System.out.print("; оценки: " + list[i].getMark1() + "; " + list[i].getMark2() + "; ");
			System.out.print(list[i].getMark3() + "; " + list[i].getMark4() + "; ");
			System.out.println();
			;
		}
	}
};

/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////

class Abiturient
{
	private int id;
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getMark1()
	{
		return mark1;
	}

	public void setMark1(int mark1)
	{
		this.mark1 = mark1;
	}

	public int getMark2()
	{
		return mark2;
	}

	public void setMark2(int mark2)
	{
		this.mark2 = mark2;
	}

	public int getMark3()
	{
		return mark3;
	}

	public void setMark3(int mark3)
	{
		this.mark3 = mark3;
	}

	public int getMark4()
	{
		return mark4;
	}

	public void setMark4(int mark4)
	{
		this.mark4 = mark4;
	}

	public Abiturient(int id, int mark1, int mark2, int mark3, int mark4)
	{
		super();
		setId(id);
		setMark1(mark1);
		setMark2(mark2);
		setMark3(mark3);
		setMark4(mark4);
	}

	public double avg()
	{
		return (getMark1() + getMark2() + getMark3() + getMark4()) / 4.0;
	}
}