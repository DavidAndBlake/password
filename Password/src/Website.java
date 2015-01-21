import javax.swing.JOptionPane;

public class Website
{
	public static void main(String[] args)
	{
		Website web;
		web = new Website();
		for (int i = 0; i < 10000; i++)
		{
			System.out.println(getGoing(i));
		}
	}

	private static String getGoing(int guess)
	{
		int password = 9999;
		if (guess == password)
		{
			return "Correct";
		}
		if (guess != password)
		{
			return "Wrong";
		}
		return null;
	}
}
