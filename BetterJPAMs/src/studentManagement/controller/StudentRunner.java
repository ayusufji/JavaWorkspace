package studentManagement.controller;

import studentManagment.model.Student;

public class StudentRunner
{
	public static void main(String[] args)
	{
		Student myStudent = new Student(true, 10, "S2401294", "Male", "John Doe", 15, 3.9);
		System.out.println(myStudent);
	}
	
	public String toString()
	{
		String str = " ";
		return str;
	}
	
	
	
}