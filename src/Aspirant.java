
public class Aspirant extends Student {
	
	private boolean arbeit; // Anzahl der Arbeiten
	private int scholarship;
	
	Aspirant(String name, String surname, int group, double average_mark, int scholarship, boolean arbeit) {
		
		super(name, surname, group, average_mark, scholarship);
		arbeit = true;
	}
	
	public boolean getArbeit() {
		return arbeit;
	}
	
	public void setArbeit(boolean arbeit) {
		this.arbeit = arbeit;
	}
	
	public int getScholarship() {
		return scholarship;
	} 
	
	public void setScholarship(double average_mark, int s_1, int s_2) {
		if (average_mark == 1.0) {
			scholarship = s_1;
		} else {
			scholarship = s_2;
		}
	}
	
}
 