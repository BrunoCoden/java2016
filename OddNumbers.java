
public class OddNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
		for (int i=1;i<100;i=i+2){
			System.out.println(i);
			cont++;
		}
		System.out.println("The number of odd numbers from 0 to 100 is: " + cont);
	}

}
