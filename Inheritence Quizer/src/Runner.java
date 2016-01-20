import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
	public static boolean running = true;
	public static Scanner things = new Scanner(System.in);
	public static ArrayList<Question> questions = new ArrayList<Question>();
	public static int count = 0;
	public static void main(String[] args)
		{
		quizStart();
		while(questions.size() > 0)
			{
			Questions.questionAsk();
			questions.remove(0);
			}
		System.out.println("You got " + count + " questions right!");
		}
	public static void quizStart()
		{
		System.out.println("Welcome! Enter in the number of questions on Inheritence you desire!");
		int num = things.nextInt();
		ArrayList<Question> stuff = Questions.makeQuestions();
		if(num < 1)
		 	{
		 	System.out.println("I'll just give you one.");
		 	num = 1;
		 	}
		if(num > 20)
			{
			System.out.println("I only have 20 questions, sorry!");
			num = 20;
			}
		for(int i = 0; i < num; i++)
		 	{
		 	int random = (int) (Math.random() * stuff.size());
		 	questions.add(stuff.get(random));
		 	stuff.remove(random);
		 	}
		}
	}
