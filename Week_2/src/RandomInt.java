package Week_2.src;

public class RandomInt {
   public static void main(String[] args) { 
      int N = Integer.parseInt(args[0]); 
      int M = Integer.parseInt(args[1]); 

      
      double r = Math.random(); // generates a random number between 0.0 (inclusive) and 1.0 (exclusive)
      
      int n = (int)Math.floor(N+Math.random()*(M-N));
 
 
 
      System.out.println("random integer is " + n); 
   } 
}  
