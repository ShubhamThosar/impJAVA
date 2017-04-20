import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlacementCell {
	
	static boolean eligible;
	static int eligible2;
	static boolean eligible3;
	
	static int marks1;
	static int marks2;
	static int marks3;
	static int totalScore;
	
	static int choice;
	
	public boolean isSelected(int technicalScore, int hrScore) {
		return false;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		Student student = new Student();
		student.setId(101);
		student.setName("Gunjan");
		student.setMarksInPercentage(78);
		student.setNoOfBacklogs(0);
		
		student.studentdetails();
		
//		System.out.println("Student details of "+student.getName());
//		System.out.println("--------------------------");
//		System.out.println("Student ID : "+student.getId());
//		System.out.println("Student Marks In Percentage : "+student.getMarksInPercentage());
//		System.out.println("Student Backlogs : "+student.getNoOfBacklogs());
		
		EligibilityCriteria eligibilityCriteria = new EligibilityCriteria();
		eligible = eligibilityCriteria.minimumEligibility(student);
		
		if(eligible){
			//if eligible to give written test
			//System.out.println("You are eligible");
			System.out.println("--------------------------");
			System.out.println(student.getName() + " is writing the Written Test");
			
			WrittenTest writtenTest = new WrittenTest();
//			marks1 = 1 + (int)(Math.random() * 100);
//			writtenTest.marks = marks1;
			marks1 = writtenTest.writtenTest(student);
		}
		else{
			System.out.println("You are not eligible");
		}
		
		if(eligible2 == 1){
			//System.out.println("Your Written Test score is  : "+marks1+", Cleared");
			System.out.println(student.getName()+" please select(number) your areas of interest from the following");
			System.out.println("1. Java");
			System.out.println("2. DBMS");
			System.out.println("3. Networking");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
				case 1: System.out.println(student.getName()+" is being interviewed on Java");
						System.out.println("Please go for HR round.. Your score is being evaluated");
						break;

				case 2: System.out.println(student.getName()+" is being interviewed on DBMS");
						System.out.println("Please go for HR round.. Your score is being evaluated");
						break;
						
				case 3:	System.out.println(student.getName()+" is being interviewed on Networking");
						System.out.println("Please go for HR round.. Your score is being evaluated");
						break;

				default: System.out.println("Invalid input");
						 break;
			}
			
			TechnicalRound technicalRound = new TechnicalRound();
//			marks2 = 1 + (int)(Math.random() * 10);
//			technicalRound.technicalSubjectLevel = marks2;
			marks2 = technicalRound.technicalInterview(marks1, student);
			
			HRRound hrRound = new HRRound();
			//marks3 = 1 + (int)(Math.random() * 10);
			hrRound.hrInterview(marks1, student);
			
			//technicalRound.technicalSubjectLevel = marks2;
			//hrRound.softSkillsLevel = marks3;
			
			System.out.println("Your Technical Interview score is "+marks2+"/10");
			System.out.println(student.getName()+" is getting interviewed for HR Round");
			System.out.println("Please wair.. Your score is being evaluated");
			System.out.println("Your HR Interview score is "+marks3+"/10");
			
			totalScore = technicalRound.technicalSubjectLevel + hrRound.softSkillsLevel;
			
			if(totalScore >= 10){
				//System.out.println("Your score for Technical and HR Round : "+totalScore+", Cleared");
				System.out.println(student.getName()+" has completed all the rounds of interview");
				System.out.println("Congratulations!!! You are now an employee of TechM");
			}
			else{
				System.out.println(student.getName()+" haven't completed all the rounds of interview");
			}
			
		}
		else{
			System.out.println("Your Written Test score is  : "+marks1+", Not Cleared");
		}
		
		
		Company company = new Company();
		company.setCompanyName("TechM");
		company.setSalaryOfferedInLPA(250000);
		company.setEligibilityCriteria(eligibilityCriteria);
		//company.setWrittenTest(writtenTest);
		//company.setTechnicalRound(technicalRound);
		//company.setHrRound(hrRound);
		
	}

}
