
public class WrittenTest {

	int marks= 1 + (int)(Math.random() * 100);
	
	public int writtenTest(Student student) {
		
		System.out.println("Your Written Test score is  : "+marks+", Cleared");
		return marks;
	}
}
