package Week_3.src;

// Note, does not print 2000, since the 1001 numbers between 1000 & 2000 (inclusive)
// does not divide evenly into 5. Would have to put in special logic to get 200 to print on its own line.

public class Q2_FivePerLine {

    public static void main (String[] args) {

        String stringToOut = "";
        for (int i=1000; i<=2000;i++) {

            if (i%5!=4) {
                stringToOut = stringToOut + " " + Integer.toString(i);
            } else {
                stringToOut = stringToOut + " " + Integer.toString(i);
                System.out.println(stringToOut);
                stringToOut = "";
            }
        }

    }


}
