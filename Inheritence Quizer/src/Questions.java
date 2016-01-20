import java.util.ArrayList;

public class Questions
	{
	public static void questionAsk()
		{
		System.out.println("Will this piece of code run correctly?");
		System.out.println(Runner.questions.get(0).getQ1() + " stuff");
		System.out.println(Runner.questions.get(0).getQ2() + " things");
		String ans = Runner.things.nextLine();
		if((ans.contains("true") && Runner.questions.get(0).isA() == true) || (ans.contains("false") && Runner.questions.get(0).isA() == false))
			{
			System.out.println("Correct! You get another McGuffin point!");
			Runner.count++;
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
