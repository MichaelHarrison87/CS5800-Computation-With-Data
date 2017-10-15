package Week_3.src;

// Note, since the 1001 numbers between 1000 & 2000 (inclusive)
// do not divide evenly into 5, have final print after the for loop to catch it.

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
        System.out.println(stringToOut);

    }


}
