package studentManagment.model;

public class Student 
{
	private boolean isCurrentStudent;
	private int gradeLevel;
	private String idNumber;
	private String name;
	private String gender;
	private int age;
	private double gpa;
	
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
	/**
	 * 
	 * @param isCurrentStudent 
	 * @param gradeLevel Student's Grade Level
	 * @param idNumber
	 * @param gender
	 * @param age
	 * @param gpa
	 */
	public Student(boolean isCurrentStudent, int gradeLevel, String idNumber, String gender, int age, double gpa)
	{
		this.isCurrentStudent = isCurrentStudent;
		this.gradeLevel = gradeLevel;
		this.idNumber = idNumber;
		this.gender = gender;
		this.age = age;
		this.gpa = gpa;
	}
	
	public String toString()
	{
		String str = "This person is not a current student.";
		if (isCurrentStudent) 
		{
		str = "Name: " + name + " " + "IDnumber:" + idNumber + " " + "Gender: " + gender + " " + "Age:" + age + " " + "GPA:" + gpa + " "+ "Grade:" + gradeLevel + " ";    
		}
		return str;
	}
	
}
