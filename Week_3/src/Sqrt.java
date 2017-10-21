package Week_3.src;
public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double epsilon = 1e-15;

		// Parse command line argument into c
		double c = Double.parseDouble(args[0]);

		if (c<0) {
		    System.out.println("Your number is negative; sqrt of negative numbers is undefined.");
		    System.exit(0);

        } else if (c==0) {

		    System.out.println("Roots of 0 are 0.");
		    System.exit(0);
        }

		// Pick the first estimate equal to c
		double t = c;

		int i = 0;
        System.out.println("Iteration " + Integer.toString(i)+": "+Double.toString(t));

		// Loop until the absolute difference between 
		// t and c/t is within epsilon relative to t
		while (Math.abs(t - c/t) > epsilon * t) {
			//  Next estimate is the average of t and c/t
			t = (t + c/t)/2;
			i++;
            System.out.println("Iteration " + Integer.toString(i)+": "+Double.toString(t));
		}

		System.out.println("Using Math.sqrt: "+Double.toString(Math.sqrt(c)));
		
	}
}
