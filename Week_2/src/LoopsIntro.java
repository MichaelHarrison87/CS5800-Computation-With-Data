package Week_2.src;

public class LoopsIntro{
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		if (a<10) {
			System.out.println("a is less than 10"); 

		}
		else {
			System.out.println("a is greater or equal to 10");

		}

		int i=1;
		while (i<=a) {

			System.out.println((int)Math.pow(2,i));		
			i++;

		}

	}
}
