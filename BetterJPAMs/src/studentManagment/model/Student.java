package studentManagment.model;

public class Student 
{
	boolean isCurrentStudent;
	int gradeLevel;
	String idNumber;
	String name;
	String gender;
	int age;
	double gpa;
	
	public Student()
	{
		isCurrentStudent = false;
		gradeLevel = 0;
		idNumber = "S00000000";
		name = " ";
		gender = " ";
		age = 0;
		gpa = 0.00; 
		
	}
}
