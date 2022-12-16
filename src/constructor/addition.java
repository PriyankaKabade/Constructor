package constructor;

public class addition {

	int x = 10;
	public static int w = 20;

	public addition() {

		int a = 10000;
		int b = 10;
		int sum = a + b;
		System.out.println("addtion Method Called for Local Variable:: " + sum);

		System.out.println("value of ststic variable w is " + x);
	}

	public static void main(String[] args) {

		addition a = new addition();
	

	}

	/**
	 * @param x
	 */
	public addition(int x) {
		super();
		this.x = x;
	}
}