
public class Main {

	public static void main(String[] args) {
		
		Student bimbo = new Student("Bimbo", "Bam", 1, 1.0, 0);
		Student mambo = new Student("Mambo", "Mam", 2, 2.5, 0);
		
		System.out.printf("%7s %7s %3s %5s %7s", bimbo.getName(), bimbo.getSurname(), bimbo.getGroup(), bimbo.getAverageMark(), bimbo.getScholarship());
		System.out.println();
		System.out.printf("%7s %7s %3s %5s %7s", mambo.getName(), mambo.getSurname(), mambo.getGroup(), mambo.getAverageMark(), mambo.getScholarship());
		System.out.println();
	}

}
