 public class Q4_Gambler
  {
     public static void main(String[] args)
     {  // Run T experiments that start with $stake
        // and terminate on $0 or $goal.

    	int stake = Integer.parseInt(args[0]);
        int goal  = Integer.parseInt(args[1]);
        int T     = Integer.parseInt(args[2]);
        double prob = Double.parseDouble(args[3]);
        
        int bets = 0;
        
        int wins = 0;
        int losses = 0;
        
        int t = 0;
        while (t < T) {  // Run one experiment.
           int cash = stake;
           while (cash > 0 && cash < goal) {  // Simulate one bet.
               bets++;

               if (Math.random() < prob) {
            	   cash++;
               }
               else {
            	   cash--;

               }
               
            }  // Cash is either 0 (ruin) or $goal (win).
           	if (cash == goal) {
        	   wins++;
           	} else{
        		   losses++;
        	}

           t++;

        }

        System.out.println(100*wins/T + "% wins");
        System.out.println("Avg # bets: " + bets/T);
        System.out.println("Total Wins: " + wins);
        System.out.println("Total Losses: " + losses);
     }
}
