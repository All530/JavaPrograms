package oops;

public class Demo {
public static void main(String[] args) {
	
	//now creating object of student 
	Student st1;
	st1 = new Student();
	
	st1.StudentName="Abhiram";
	st1.StudentId=25;
	st1.StudentCity="texas";
	
	st1.study();
	st1.showFullDetails();
	
	Student st2;
	st2 = new Student();
	
	st2.StudentName="Alexa";
	st2.StudentId=53;
	st2.StudentCity="Copenhagen";
	
	st2.study();
	st2.showFullDetails();
}
}
