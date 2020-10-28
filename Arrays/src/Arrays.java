
public class Arrays {

	public static void main(String[] args) {
		int[] numbers = {12, 3, 6, 7, 6, 3, 3};
		int total=0;
		
		for (int i=0; i<numbers.length; i++)
		{
			total = total + numbers[i];
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(total);
		
		//finding max number
		
		int max = numbers[0]; //initial condition
		
		for (int i=1; i<numbers.length; i++)
		{
			if (numbers[i]>max) {
				max=numbers[i];
			}
		}

	}

}
