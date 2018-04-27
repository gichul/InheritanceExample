package edu.handong.csee.java.example.inheritance;

public class Faculty extends Person{
	private int facultyNumber;
	
	public Faculty(String initialName, int facultyNumber) {
		super(initialName);
		setFacultyNumber(facultyNumber);
		
	} 
	
	public void reset(String newName, int newFacultyNumber) {
		setName(newName);
		setFacultyNumber(facultyNumber);
	}
	


	public int getFacultyNumber() {
		return facultyNumber;
	}

	public void setFacultyNumber(int facultyNumber) {
		this.facultyNumber = facultyNumber;
	}
	
	public boolean equals(Faculty p) {
		if(this.facultyNumber==p.facultyNumber) {
			return true;
		}
		return false;
		
	}
	
	
}
