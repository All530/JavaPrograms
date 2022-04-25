package oops;

public class Student {
//properties:Data members: instance variables
	int StudentId;
	String StudentName;
	String StudentCity;

//Behaviour: Member methods: Methods: (Functions)
public void study()
{
	System.out.println(StudentName + " is studying ");
}
public void showFullDetails()
{
	System.out.println("My Name is " + StudentName);
	System.out.println("My Id is " + StudentId);
	System.out.println("My City is " + StudentCity);
}
}
