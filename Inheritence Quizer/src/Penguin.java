public class Penguin extends Bird
	{
	public Penguin()
		{
		name = "Penguin";
		food = "fish";
		myFly = (FlightBehavior) new CannotFly();
		}
	public void makeNoise()
		{
		System.out.println("The penguin says Squwak!");
		}
	}