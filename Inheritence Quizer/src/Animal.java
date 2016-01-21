public abstract class Animal
	{
	protected String name;
	protected String food;
	protected FlightBehavior myFly;
	public abstract void bearYoung();
	public void eat()
		{
		System.out.println("The " + name + " sure loves the " + food + " they are eating!");
		}
	public abstract void makeNoise();
	public String toString()
		{
		return super.toString();
		}
	public String getName()
		{
		return name;
		}
	public void fly()
		{
		
		}
	}
