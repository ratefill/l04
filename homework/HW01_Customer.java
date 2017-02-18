package by.epam.l04.homework;

/*Создать описанные ниже классы. Определить конструктор и методы set(), get(),
show(). Определить дополнительно какой – либо метод для каждого класса.
Реализовать класс в консольном приложении. Задать критерий выбора данных и
вывести эти данные на консоль.
Student : id, Фамилия, Имя, Отчество, Дата рождения, Адрес, Телефон, Факультет,
Курс.
Customer: id, Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер
банковского счета.*/

public class HW01_Customer extends HW01_Human
{
	private String CreaditCard;
	private String Account;


	public String getCreaditCard()
	{
		return CreaditCard;
	}

	public void setCreaditCard(String creaditCard)
	{
		CreaditCard = creaditCard;
	}

	public String getAccount()
	{
		return Account;
	}

	public void setAccount(String account)
	{
		Account = account;
	}
	
	@Override
	public void Show()
	{
		super.Show();
		System.out.println("Кредитная карта   " + getCreaditCard());
		System.out.println("Банковский счет   " + getAccount());
	}
};
