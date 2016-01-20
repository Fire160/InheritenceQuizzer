import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
	public static boolean running = true;
	public static int count = 0;
	public static void main(String[] args)
		{
		ArrayList<Question> questions = new ArrayList<Question>();
		quizStart(questions);
		while(questions.size() > 0)
			{
			Questions.questionAsk(questions);
			questions.remove(0);
			}
		System.out.println("You got " + count + " questions right!");
		}
	public static void quizStart(ArrayList<Question> questions)
		{
		System.out.println("Welcome! Enter in the number of questions on Inheritence you desire!");
		Scanner things = new Scanner(System.in);
		int num = things.nextInt();
		ArrayList<Question> stuff = Questions.makeQuestions();
		if(num < 1)
		 	{
		 	System.out.println("I'll just give you one.");
		 	num = 1;
		 	}
		if(num > 24)
			{
			System.out.println("I only have 24 questions, sorry!");
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
