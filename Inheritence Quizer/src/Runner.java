import java.util.Scanner;

public class Runner
	{
	public static boolean running = true;
	public static Scanner things = new Scanner(System.in);
	public static int count = 0;
	public static void main(String[] args)
		{
		int times = quizStart();
		while(times > 0)
			{
			Questions.questionAsk();
			times -= 1;
			}
		}
	public static int quizStart()
		{
		System.out.println("Welcome! Enter in the number of questions on Inheritence you desire!");
		return things.nextInt();
		}
	}
