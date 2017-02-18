package by.epam.l04.example;

public class Book2
{
	private String title;
	private String author;
	private int yearPublished;

	public Book2()
	{
		title = "";
		author = "";

		yearPublished = 0;
	}

	// конструктор с аргументами
	public Book2(String _title, String _author, int _yearPublished)
	{
		title = _title;
		author = _author;
		yearPublished = _yearPublished;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public int getYearPublished()
	{
		return yearPublished;
	}

	public void setYearPublished(int yearPublished)
	{
		this.yearPublished = yearPublished;
	}
}
