public class Quadratic { 
   public static void main(String[] args) { 
 
      // parse coefficients from command-line 
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[1]); 
      double c = Double.parseDouble(args[2]); 
 
      // calculate roots 
      double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
      double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/ (2*a);
 
      // print them out 
      System.out.println(root1); 
      System.out.println(root2); 
   } 
}  
