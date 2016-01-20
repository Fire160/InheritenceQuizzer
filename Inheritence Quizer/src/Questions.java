import java.util.ArrayList;
import java.util.Scanner;

public class Questions
	{
	public static void questionAsk(ArrayList<Question> questions)
		{
		Scanner first = new Scanner(System.in);
		System.out.println("--------------------------------------");
		System.out.println("Will this piece of code run correctly?");
		System.out.println(questions.get(0).getQ() + " stuff");
		System.out.println(questions.get(0).getqTwo() + " things");
		String ans = first.nextLine();
		if(ans.contains("true") && questions.get(0).isA() == true)
			{
			System.out.println("Correct! You get another McGuffin point!");
			Runner.count++;
			}
		else if(ans.contains("false") && questions.get(0).isA() == false)
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
		temp.add(new Question("Animal a = new Bat();","a.eat();",true));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		temp.add(new Question("Placeolder","Swag",false));
		return temp;
		}
	}
