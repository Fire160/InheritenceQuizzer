import java.util.ArrayList;
import java.util.Scanner;

public class Questions
	{
	public static void questionAsk(ArrayList<Question> questions)
		{
		Scanner first = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Will this piece of code run correctly?");
		System.out.println(questions.get(0).getQ());
		System.out.println(questions.get(0).getqTwo());
		String ans = first.nextLine();
		if(ans.contains("t") && questions.get(0).isA() == true)
			{
			System.out.println("Correct! You get another McGuffin point!");
			Runner.count++;
			}
		else if(ans.contains("f") && questions.get(0).isA() == false)
			{
			System.out.println("Correct! You get another McGuffin point!");
			Runner.count++;
			}
		else
			{
			System.out.println("Sorry that's wrong!");
			}
		}
	public static ArrayList<Question> makeQuestions()
		{
		ArrayList<Question> temp = new ArrayList<Question>();
		temp.add(new Question("Animal a = new FlightBehavior();","a.flies();",false));
		temp.add(new Question("Animal a = new Mammal();","a.eat();",true));
		temp.add(new Question("Animal a = new Bat();","a.growFur();",false));
		temp.add(new Question("Bat a = new Bat();","a.flies();",true));
		temp.add(new Question("Cow a = new Bat();","a.eat();",false));
		temp.add(new Question("Penquin a = new Bat();","a.eat();",false));
		temp.add(new Question("FlightBehavior a = new Animal();","a.flies();",false));
		temp.add(new Question("Mammal a = new Bat();","a.eat();",true));
		temp.add(new Question("Mammal a = new Bat();","a.bearYoung();",true));
		temp.add(new Question("Mammal a = new Cow();","a.growFeathers();",false));
		temp.add(new Question("Mammal a = new Cow();","a.bearYoung();",true));
		temp.add(new Question("Animal a = new Cow();","a.GrowFur();",false));
		temp.add(new Question("Bird a = new Bat();","a.eat();",false));
		temp.add(new Question("Bird a = new Robin();","a.growFeathers();",true));
		temp.add(new Question("Bird a = new Robin();","a.growFur();",false));
		temp.add(new Question("Bird a = new Penguin();","a.flies();",true));
		temp.add(new Question("Bird a = new Penguin();","a.growFur();",false));
		temp.add(new Question("Mammal a = new Penguin();","a.bearYoung();",false));
		temp.add(new Question("Animal a = new Bird();","a.eat();",true));
		temp.add(new Question("Animal a = new Penguin();","a.growFur();",false));
		temp.add(new Question("Animal a = new Robin();","a.growFeathers();",false));
		temp.add(new Question("Animal a = new Cow();","a.bearYoung();",true));
		temp.add(new Question("FlightBehavior a = new Bat();","a.flies();",false));
		temp.add(new Question("FlightBehavior a = new Mammal();","a.bearYoung();",false));
		return temp;
		}
	}
