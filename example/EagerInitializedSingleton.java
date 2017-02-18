package by.epam.l04.example;

public class EagerInitializedSingleton
{
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton()
	{
	}

	public static EagerInitializedSingleton getInstance()
	{
		return instance;
	}
}
