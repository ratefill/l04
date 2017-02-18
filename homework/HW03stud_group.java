package by.epam.l04.homework;

import java.util.Random;

/*Оценки, полученные студентами в сессию, являются атрибутами класса Student.
Определить:
а) средний балл учебной группы (использовать класс Group);
б) средний балл каждого студента;
в) число отличников;
г) количество студентов, имеющих "2".
*/
public class HW03stud_group
{
	public static void main(String[] args)
	{
		StudentGroup st = new StudentGroup(20);
		st.count();
		st.avg();
		st.badboy();
		st.perfect();
		//st.Find(2);
	}
}

//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////


class StudentGroup
{
	private Student[] st;

	public StudentGroup(int count)
	{
		super();

		final Random random = new Random();
		int studentID;
		int MathAnalysis;
		int AnalGeom;
		int DiffControl;
		int PhysTraining;
		int Asm;

		st = new Student[count];

		for (int i = 0; i < count; i++)
		{
			studentID = i + 1;
			// генерация ботаника!
			if (random.nextInt(5) == 1)
			{
				MathAnalysis = AnalGeom = DiffControl = PhysTraining = Asm = 5;
			}
			else
			{
				MathAnalysis = random.nextInt(4) + 2;
				AnalGeom = random.nextInt(4) + 2;
				DiffControl = random.nextInt(4) + 2;
				PhysTraining = random.nextInt(4) + 2;
				Asm = random.nextInt(4) + 2;
			}

			st[i] = new Student(studentID, MathAnalysis, AnalGeom, DiffControl, PhysTraining, Asm);
		}
	}

	public void avg()
	{
		double Result = 0;

		for (int i = 0; i < st.length; i++)
		{
			Result += st[i].Avg();
		}

		Result /= st.length;

		System.out.println("Средний балл в группе: " + Result);

	}

	public void perfect()
	{
		int Result = 0;

		for (int i = 0; i < st.length; i++)
		{
			if (st[i].Avg() == 5)
			{
				Result++;
			}
		}

		System.out.println("Кол-во отличников в группе: " + Math.round(Result));
	}

	public void badboy()
	{
		int Result = 0;

		for (int i = 0; i < st.length; i++)
		{
			if (st[i].badboy())
			{
				Result++;
			}
		}

		System.out.println("Кол-во студентов, имеющих хвосты: " + Math.round(Result));
	}

	public void count()
	{
		System.out.println("Кол-во студентов в группе: " + st.length);
	}

	public void Find(int StudentID)
	{
		boolean result = false;
		for (int i = 0; i < st.length; i++)
		{
			if (st[i].getStudentID() == StudentID)
			{
				st[i].print();
				result = true;
				break;
			}
		}
		if (!result)
		{
			System.out.println("Студент ID=" + StudentID + " не найден!");
		}
	}
}

//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////

class Student
{
	private int studentID;
	public static final int SubjTotal = 5;
	private int rateMathAnalysis;// матан
	private int rateAnalGeom;// аналит. геометрия :-))))
	private int rateDiffControl;// дифуры
	private int ratePhysTraining; // физра
	private int rateAsm; // основы асемблера

	public int getStudentID()
	{
		return studentID;
	}

	public void setStudentID(int studentID)
	{
		this.studentID = studentID;
	}

	public int getRateMathAnalysis()
	{
		return rateMathAnalysis;
	}

	public void setRateMathAnalysis(int rateMathAnalysis)
	{
		this.rateMathAnalysis = rateMathAnalysis;
	}

	public int getRateAnalGeom()
	{
		return rateAnalGeom;
	}

	public void setRateAnalGeom(int rateAnalGeom)
	{
		this.rateAnalGeom = rateAnalGeom;
	}

	public int getRateDiffControl()
	{
		return rateDiffControl;
	}

	public void setRateDiffControl(int rateDiffControl)
	{
		this.rateDiffControl = rateDiffControl;
	}

	public int getRatePhysTraining()
	{
		return ratePhysTraining;
	}

	public void setRatePhysTraining(int ratePhysTraining)
	{
		this.ratePhysTraining = ratePhysTraining;
	}

	public int getRateAsm()
	{
		return rateAsm;
	}

	public void setRateAsm(int rateAsm)
	{
		this.rateAsm = rateAsm;
	}

	public Student(int studentID, int rateMathAnalysis, int rateAnalGeom, int rateDiffControl, int ratePhysTraining,
			int rateAsm)
	{
		super();
		this.studentID = studentID;
		this.rateMathAnalysis = rateMathAnalysis;
		this.rateAnalGeom = rateAnalGeom;
		this.rateDiffControl = rateDiffControl;
		this.ratePhysTraining = ratePhysTraining;
		this.rateAsm = rateAsm;
	}

	public double Avg()
	{
		double Result;

		Result = (getRateMathAnalysis() + getRateMathAnalysis() + getRateAnalGeom() + getRateDiffControl()
				+ getRatePhysTraining() + getRateAsm()) / SubjTotal;

		return Result;
	}

	public boolean badboy()
	{
		if (getRateMathAnalysis() == 2 || getRateMathAnalysis() == 2 || getRateAnalGeom() == 2
				|| getRateDiffControl() == 2 || getRatePhysTraining() == 2 || getRateAsm() == 2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public void print()
	{
		System.out.println("Студент: " + getStudentID());
		System.out.println("Матан: " + getRateMathAnalysis());
		System.out.println("аналит. геометрия: " + getRateAnalGeom());
		System.out.println("дифуры: " + getRateDiffControl());
		System.out.println("физра: " + getRatePhysTraining());
		System.out.println("основы асемблера: " + getRateAsm());
		System.out.println("имеет хвосты: " + badboy());
		System.out.println("средний балл: " + Avg());
		
	}
}
