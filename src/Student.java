
public class Student {

	private String name;
	private String surname;
	private int group;
	private double average_mark;
	private int scholarship;
	
	public Student(String name, String surname, int group, double average_mark, int scholarship) {
		this.name = name;
		this.surname = surname;
		this.group = group;
		this.average_mark = average_mark;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getGroup() {
		return group;
	}
	
	public void setGroup(int group) {
		this.group = group;
	}
	
	public double getAverageMark() {
		return average_mark;
	}
	
	public void setAverageMark(double average_mark) {
		this.average_mark = average_mark;
	}
	
	public int getScholarship() {
		return scholarship;
	}
	
	public void setScholarship(int scholarship) {
		//this.scholarship = scholarship;
		if (this.average_mark == 1.0) {
			this.scholarship = 100;
		} else {
			this.scholarship = 80;
		}
	}
	
}
 