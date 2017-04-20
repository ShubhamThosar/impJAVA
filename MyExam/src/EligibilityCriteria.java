
public class EligibilityCriteria {

	int requiredPercentage = 60;
	int maxNoOfBacklogAllowed = 2;
	public static boolean selected;
	
	public boolean minimumEligibility(Student student) {
		
		selected=false;
		
		if(student.marksInPercentage >= requiredPercentage && student.noOfBacklogs <= maxNoOfBacklogAllowed){
			//System.out.println("true");
			selected=true;
			return selected;
		}
		return selected;
		
	}
}
