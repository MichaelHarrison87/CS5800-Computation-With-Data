public class ThreeSort{
	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		int gmin = Math.min(Math.min(a,b),c);
		int gmax = Math.max(Math.max(a,b),c);

		int middle = (a+b+c)- (gmin+gmax);
			
	        System.out.println(gmin); 
	        System.out.println(middle); 
	        System.out.println(gmax); 



	}
}
