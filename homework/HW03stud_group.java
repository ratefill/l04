package by.epam.l04.homework;

import java.util.Random;

/*������, ���������� ���������� � ������, �������� ���������� ������ Student.
����������:
�) ������� ���� ������� ������ (������������ ����� Group);
�) ������� ���� ������� ��������;
�) ����� ����������;
�) ���������� ���������, ������� "2".
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
			// ��������� ��������!
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

		System.out.println("������� ���� � ������: " + Result);

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

		System.out.println("���-�� ���������� � ������: " + Math.round(Result));
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

		System.out.println("���-�� ���������, ������� ������: " + Math.round(Result));
	}

	public void count()
	{
		System.out.println("���-�� ��������� � ������: " + st.length);
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
			System.out.println("������� ID=" + StudentID + " �� ������!");
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
	private int rateMathAnalysis;// �����
	private int rateAnalGeom;// ������. ��������� :-))))
	private int rateDiffControl;// ������
	private int ratePhysTraining; // �����
	private int rateAsm; // ������ ���������

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
		System.out.println("�������: " + getStudentID());
		System.out.println("�����: " + getRateMathAnalysis());
		System.out.println("������. ���������: " + getRateAnalGeom());
		System.out.println("������: " + getRateDiffControl());
		System.out.println("�����: " + getRatePhysTraining());
		System.out.println("������ ���������: " + getRateAsm());
		System.out.println("����� ������: " + badboy());
		System.out.println("������� ����: " + Avg());
		
	}
}
