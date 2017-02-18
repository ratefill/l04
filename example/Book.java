package by.epam.l04.example;

public class Book
{
	private String title;
	private String author;
	private int yearPublished;

	public void setBookParam(String _title, String _author, int _yearPublished)
	{
		title = _title;
		author = _author;
		yearPublished = _yearPublished;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public int getYearPublished()
	{
		return yearPublished;
	}
};


