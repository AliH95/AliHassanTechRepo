package statvariable;

public class Account {
	
	static int Dollar; //static because it's shared by all objects
	public void amount (int amo) {
		int T = amo*Dollar;
		System.out.println("Amount:"+T);
	}
	public void SetDollar(int D) {
		Dollar = D;
	}

}
