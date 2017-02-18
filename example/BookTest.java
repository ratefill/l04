package by.epam.l04.example;

public class BookTest
{
	public static void main(String[] args)
	{
		Book myBook = new Book();
		myBook.setBookParam("Java", "Gosling", 1999);
		System.out.println("Title book = " + myBook.getTitle());		
	}
}
