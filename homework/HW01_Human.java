package by.epam.l04.homework;

/*Создать описанные ниже классы. Определить конструктор и методы set(), get(),
show(). Определить дополнительно какой – либо метод для каждого класса.
Реализовать класс в консольном приложении. Задать критерий выбора данных и
вывести эти данные на консоль.
Student : id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет,
Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер
банковского счета.*/

public class HW01_Human
{

	protected int ID;
	protected String FirstName;
	protected String MiddleName;
	protected String LastName;
	protected String Address;

	public int getID()
	{
		return ID;
	}

	public void setID(int iD)
	{
		ID = iD;
	}

	public String getFirstName()
	{
		return FirstName;
	}

	public void setFirstName(String firstName)
	{
		FirstName = firstName;
	}

	public String getMiddleName()
	{
		return MiddleName;
	}

	public void setMiddleName(String middleName)
	{
		MiddleName = middleName;
	}

	public String getLastName()
	{
		return LastName;
	}

	public void setLastName(String lastName)
	{
		LastName = lastName;
	}

	public String getAddress()
	{
		return Address;
	}

	public void setAddress(String address)
	{
		Address = address;
	}

	public void Show()
	{
		System.out.println("ID                " + getID());
		System.out.println("Фамилия           " + getLastName());
		System.out.println("Имя               " + getFirstName());
		System.out.println("Отчество          " + getMiddleName());
		System.out.println("Адрес             " + getAddress());
	}
};
