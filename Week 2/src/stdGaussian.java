public class stdGaussian{
	public static void main(String[] args) {
	
		double u = Math.random(); 
		double v = Math.random(); 
		
		double w = Math.sin(2*Math.PI*v)*Math.sqrt(-2*Math.log(u));

		System.out.println(w);	


	}
}
