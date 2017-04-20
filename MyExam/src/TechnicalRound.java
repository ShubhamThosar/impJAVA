
public class TechnicalRound {

	int technicalSubjectLevel = 1 + (int)(Math.random() * 10);
	
	public int technicalInterview(int writtenScore, Student student) {
		
		if(writtenScore >= 50){
			System.out.println("Your Technical Interview score is "+technicalSubjectLevel+"/10");
			return technicalSubjectLevel;
		}
		else{
			return technicalSubjectLevel;
		}
	}
}
