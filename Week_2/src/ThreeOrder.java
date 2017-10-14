package Week_2.src;

public class ThreeOrder{
	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);

		boolean result = ((x<y)&&(y<z))||((x>y)&&(y>z));

	        System.out.println(result); 



	}
}
