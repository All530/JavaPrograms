package ops;

public class Student1 {

	
	public Student1()
		{
		System.out.println("It's Constructor");
		}
	public Student1(String c, String ci, String p) {
	Course=c;
	CourseId=ci; 
	Program=p;
	}
	{
		System.out.println("It's Parametrized Constructor");
	}
	
	
	
	String Course;
	String CourseId;
	String Program;
	
	public void study()
	{
		System.out.println( "Course is " + Course);
	}
	public void study(String a)
	{
		System.out.println("Progrm is " + Program);
	}
	public void showFullDetails()
	{
		System.out.println("Her Course is " + Course);
		System.out.println("Her CourseId is " + CourseId);
		System.out.println("Her Program is " + Program);
		
	}
	
}