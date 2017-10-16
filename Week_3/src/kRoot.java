//package Week_3.src;
public class kRoot{

    public static void main(String[] args) {
        double epsilon = 1e-15;

        // Parse command line argument into c
        double c = Double.parseDouble(args[0]);
        double k = Double.parseDouble(args[1]);

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
        while (Math.abs(t - c/Math.pow(t,k-1)) > epsilon * Math.pow(t,k-1)) {
            //  Next estimate is the average of t and c/t
            //t = (t + c/Math.pow(t,k-1))/2;
            t = ((k-1)/k)*t + (c/(k*Math.pow(t,k-1)));
        	i++;
            System.out.println("Iteration " + Integer.toString(i)+": "+Double.toString(t));
        }

        System.out.println("Using Math.pow: "+Double.toString(Math.pow(c,1/k)));


    }
}

