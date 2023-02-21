import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //Create a File object for the letter_frequency.csv file
        File inputFile = new File("letter_frequency.csv");
        //Create a BufferedReader to read from the file
        BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
        //Skip the first line of the file
        fileReader.readLine();
        //Create a String variable to store the current line
        String line;
        //Create a String variable to store the next token from the StringTokenizer
        String token;
        //Create an int variable for adding up the total frequency
        int totalFrequency = 0;
        //Create a float variable for adding up the total percentage
        float totalPercentage = 0;
        //Loop until the end of the file has been reached
        while ((line = fileReader.readLine()) != null) {
            //Create a StringTokenizer that takes in the current line
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            //If the line is not empty
            if (stringTokenizer.hasMoreTokens()) {
                //Print the letter
                System.out.print(stringTokenizer.nextToken(" ,\""));
                //Store the next token
                token = stringTokenizer.nextToken();
                //Convert the token to an int and add it to the total frequency
                totalFrequency += Integer.parseInt(token);
                //Print the letter's frequency
                System.out.print("\tFrequency: " + token);
                //Store the next token
                token = stringTokenizer.nextToken();
                //Convert the token to a float and add it to the total percentage
                totalPercentage += Float.parseFloat(token);
                //Print the letter's percentage
                System.out.println("\tPercentage: " + token);
            }
        }
        //Print a line with the average frequency and total percentage of all the letters
        System.out.println("Total:" + "\tAverage Frequency: " + totalFrequency / 26 + "\tTotal Percentage: " + totalPercentage);
        //Close the BufferedReader
        fileReader.close();
    }
}
