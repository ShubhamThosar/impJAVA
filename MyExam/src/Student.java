
public class Student {

	int id;
	String name;
	int marksInPercentage;
	int noOfBacklogs;
	
	public void studentdetails() {
		System.out.println("Student details of "+getName());
		System.out.println("--------------------------");
		System.out.println("Student ID : "+getId());
		System.out.println("Student Marks In Percentage : "+getMarksInPercentage());
		System.out.println("Student Backlogs : "+getNoOfBacklogs());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarksInPercentage() {
		return marksInPercentage;
	}

	public void setMarksInPercentage(int marksInPercentage) {
		this.marksInPercentage = marksInPercentage;
	}

	public int getNoOfBacklogs() {
		return noOfBacklogs;
	}

	public void setNoOfBacklogs(int noOfBacklogs) {
		this.noOfBacklogs = noOfBacklogs;
	}
}
