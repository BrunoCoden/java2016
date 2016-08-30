
public class OddNumbersPlusAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=99; i>=1; i=i-2) {
			System.out.println(i);
			sum=sum + i;
		}
		System.out.println("The addition of all odds numbers from 100 to 0 is:" + sum );
	}

}
