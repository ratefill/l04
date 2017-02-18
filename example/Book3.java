package by.epam.l04.example;

public class Book3
{
	private String title;
	private String author;
	private int yearPublished;

	public Book3()
	{
		this("", "", 0);
	}

	public Book3(String _title, String _author, int _yearPublished)
	{
		title = _title;
		author = _author;
		yearPublished = _yearPublished;
	}

	public String getBook()
	{
		return title + " " + author + " " + yearPublished;
	}
}
