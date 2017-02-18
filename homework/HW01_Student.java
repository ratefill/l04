package by.epam.l04.homework;

import java.util.Date;

/*Создать описанные ниже классы. Определить конструктор и методы set(), get(),
show(). Определить дополнительно какой – либо метод для каждого класса.
Реализовать класс в консольном приложении. Задать критерий выбора данных и
вывести эти данные на консоль.
Student : id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет,
Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер
банковского счета.*/

public class HW01_Student extends HW01_Human
{
	protected Date DateOfBirth;
	protected String Phone;
	protected String Faculty;
	protected byte Year;
	
	public Date getDateOfBirth()
	{
		return DateOfBirth;
	}
	public void setDateOfBirth(Date DateOfBirth)
	{
		this.DateOfBirth = DateOfBirth;
	}
	public String getPhone()
	{
		return Phone;
	}
	public void setPhone(String Phone)
	{
		this.Phone = Phone;
	}
	public String getFaculty()
	{
		return Faculty;
	}
	public void setFaculty(String Faculty)
	{
		this.Faculty = Faculty;
	}
	public byte getYear()
	{
		return Year;
	}
	public void setYear(byte i)
	{
		this.Year = i;
	}

	@Override
	public void Show()
	{
		super.Show();
		System.out.println("День рождения   " + getDateOfBirth());
		System.out.println("Телефон   " + getPhone());
		System.out.println("Факультет и курс " + getFaculty()+", "+getYear()+" курс");
	}
};
