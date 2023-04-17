package constructorAssignments;

import java.util.Scanner;

public class AcademyClass11 {
	// Create Academy class with appropriate attributes (instance variable) and
	// create getter & setter

	private String subject;
	private String teachername;
	private double totalmonth;

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setTeachername(String teachername) {
		this.teachername =teachername ;
	}

	public void setTotalmonth(double totalmonth) {
		this.totalmonth = totalmonth;
	}

	public String getSubject() {
		return subject;
	}

	public String getTeachername() {
		return teachername;
	}

	public double getTotalmonth() {
		return totalmonth;
	}

	public static void main(String[] args) {

		AcademyClass11 a = new AcademyClass11();
		a.setSubject("Math");
		a.setTeachername("Vishal");
		a.setTotalmonth(2);
		
		System.out.println(a.getSubject()+" "+a.getTeachername()+" "+a.getTotalmonth());

	}

}
