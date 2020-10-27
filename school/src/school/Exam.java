package school;

public class Exam {
	
	private int phy, che, total;
	private float per;
	String studentname;
	
	public void showResults() {
		
		System.out.println(studentname);
		System.out.println(phy);
		System.out.println(che);
	}
	
	public void physics (int a) {
		if (a>=0 && a<=100) {
			phy=a;
		}
		else {
			System.out.println("Invalid physics mark");
		}
	}

}
