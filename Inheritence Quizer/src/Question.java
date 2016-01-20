public class Question
	{
	private String q;
	private String qTwo;
	private boolean a;
	public Question(String s, String st, boolean t)
		{
		q = s;
		qTwo = st;
		a = t;
		}
	public boolean isA()
		{
		return a;
		}
	public void setA(boolean a)
		{
		this.a = a;
		}
	public String getqTwo()
		{
		return qTwo;
		}
	public void setqTwo(String qTwo)
		{
		this.qTwo = qTwo;
		}
	public String getQ()
		{
		return q;
		}
	public void setQ(String q)
		{
		this.q = q;
		}
	}