package ops;

public class demo {
public static void main (String[] args) 
{
	Student1 st1;
	st1=new Student1();

	st1.Course="Medical";
	st1.CourseId="MBZ";
	st1.Program="Undergrad";
			
	st1.study();
	st1.showFullDetails();
	
	Student1 st2;
	st2=new Student1("Caligraphy","CPY","Grad");
	
	
	st2.study();
	st2.showFullDetails();
	
	
}
}