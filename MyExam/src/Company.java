
public class Company {

	String companyName;
	float salaryOfferedInLPA;
	EligibilityCriteria eligibilityCriteria;
	WrittenTest writtenTest;
	TechnicalRound technicalRound;
	HRRound hrRound;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getSalaryOfferedInLPA() {
		return salaryOfferedInLPA;
	}
	public void setSalaryOfferedInLPA(float salaryOfferedInLPA) {
		this.salaryOfferedInLPA = salaryOfferedInLPA;
	}
	public EligibilityCriteria getEligibilityCriteria() {
		return eligibilityCriteria;
	}
	public void setEligibilityCriteria(EligibilityCriteria eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}
	public WrittenTest getWrittenTest() {
		return writtenTest;
	}
	public void setWrittenTest(WrittenTest writtenTest) {
		this.writtenTest = writtenTest;
	}
	public TechnicalRound getTechnicalRound() {
		return technicalRound;
	}
	public void setTechnicalRound(TechnicalRound technicalRound) {
		this.technicalRound = technicalRound;
	}
	public HRRound getHrRound() {
		return hrRound;
	}
	public void setHrRound(HRRound hrRound) {
		this.hrRound = hrRound;
	}
}
