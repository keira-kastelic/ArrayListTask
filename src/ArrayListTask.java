import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListTask {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in); // creating a new scanner
        ArrayList<String> arr = new ArrayList<>(); // creating a new string arrya list
        int numBuckets = 0; // creating a variable to count the number of buckets in the array

        // Task one
        int question = 1; // creating a variable to print the string entered for the user
        for(int i = 0; i < 10; i++){ // creating a for loop to loop through the array 10 times
            System.out.println("Enter string " + question); // asking the user to enter a string
            String str = s.nextLine(); // reading in the input
            arr.add(str); // adding the input to the array
            numBuckets++; // updating the buckets in the array
            question++; // updating the string entered
        }

        // Task two
        int numAs = 0; // creating a variable to count the number of A's in the array
        for (int f = 0; f < numBuckets; f++){ // creating a for loop to loop through the buckets of the array
            for(int t = 0; t < arr.get(f).length(); t++){ // creating a for loop to loop through the index of the string at one bucket
                if (arr.get(f).charAt(t) == 'a' || arr.get(f).charAt(t) == 'A'){ // creating an if statement to see if the index contains an a
                    numAs++; // is fo, adding to the number of a's in the array
                }
                if (t == arr.get(f).length()){ // creating an if statement to reset t to 0 once one bucket of the array has been checked
                    t = 0;
                }
            }
        }
        System.out.println("there are " + numAs + " A's in your array list"); // printing the number of a's in the array

        // Task three
        for(int n = 1; n <= numBuckets - 1; n++){ // creating a for loop to loop through the array
            if(arr.get(n).equals(arr.get(n - 1))){ // creating an if statement to see if the two values next to eachother are the same
                arr.remove(n); // removing the array index if it is the same
                numBuckets--; // updating the number of buckets filled
            }
        }
        System.out.println(arr);

        // Task four
        ArrayList<Point> point = new ArrayList<>(); // creating a point array list
        // creating new points for the array list
        point.add(new Point(0,1));
        point.add(new Point(1,2));
        point.add(new Point(2,3));
        System.out.println(point); // printing the points
        // updating the points/ setting a new location
        point.get(0).setLocation(0,-1);
        point.get(1).setLocation(1,-2);
        point.get(2).setLocation(2,-3);
        System.out.println(point); // printing the points
        // creating new points at each of the index
        point.get(0).setLocation(new Point(0,10));
        point.get(1).setLocation(new Point(1,20));
        point.get(2).setLocation(new Point(2,30));
        System.out.println(point); // printing the points

    }
}
