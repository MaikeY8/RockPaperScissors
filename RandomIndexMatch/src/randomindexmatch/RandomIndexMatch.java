/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomindexmatch;

import javax.swing.JOptionPane;

/**
 * Create a matching index and element application that allows the user to enter
 * the size of an array, and then randomly fills each element of the array with
 * a number that has a 1 in 10 chance of being the same value as the index
 * itself. This means it will be a random number in a range between five less
 * than the index and five more than the index. The program also counts how many
 * times that the program generated an index value that matched the index
 * itself. Then the program displays the array and the number of matches.
 *
 * @author m.yan
 */
public class RandomIndexMatch {

    static final String TITLE = "Random Index Match";

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        start();
        program();
        end();
    }

    /**
     * Starts the application and welcomes user with a dialog
     */
    private static void start() {
        // Call output to generate a dialog and attach the title global variable
        output("Welcome to " + TITLE);
    }

    /**
     * Ends the application with a dialog and terminates the application
     */
    private static void end() {
        // Call output dialog and attach global title then terminate the app
        output("Thanks for using " + TITLE);
        System.exit(0);                                 // Terminates the app
    }

    /**
     * Ask the user a yes and no question, in a confirm dialog box
     *
     * @param text the yes no question to ask in the dialog
     * @return true (yes), false (no)
     */
    private static boolean yesNo(String text) {
        // Store the user's response in a variable from what they clicked on
        // when the dialog appears only showing "yes" and "no" buttons for 
        // the user to choose from  
        int response = JOptionPane.showConfirmDialog(null, text, TITLE,
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Outputs text in a more visual graphical dialog
     *
     * @param text the text to display
     */
    private static void output(String text) {
        // Add the display area to the dialog to show the user
        JOptionPane.showMessageDialog(null, text, TITLE,
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Ask the user if they want to play again, in a dialog box
     *
     * @return true (yes, play again), false (no)
     */
    private static boolean playAgain() {
        // Send the yesNo method the play again message
        return yesNo("Do you want to play again?");
    }

    private static void program() {
        do {
            int size = inputInteger("Please enter the size of the array to "
                    + "generate");
            int numbers[] = new int[size];
            int indexMatches = 0;
            for (int i = 0; i < size; i++) {
                numbers[i] = random(i - 5, i + 5);
                if (numbers[i] == i) {
                    indexMatches++;
                }
            }
            String text = "The array of size " + size + ":" + "\n" + "\n"
                    + "Index matches = " + indexMatches + "\n" + "\n";
            for (int i = 0; i < size; i++) {
                text += "Index " + i + " = " + numbers[i] + "\n";
            }
            output(text);
        } while (playAgain() == true);
    }

    /**
     * Generate a random number (a double) in a range
     *
     * @param low the lowest double in the range
     * @param high the highest double in the range
     * @return random double in the range
     */
    private static double random(double low, double high) {
        return (high - low + 1d) * Math.random() + low;
    }

    /**
     * Generate a random number (an integer) in a range
     *
     * @param low the lowest integer in the range
     * @param high the highest integer in the range
     * @return random integer in the range
     */
    private static int random(int low, int high) {
        return (int) (random((double) low, (double) high));
    }

    /**
     * Asks the user for a number (integer) in a input dialog box
     *
     * @param text the text for the dialog box
     * @return a valid integer
     */
    private static int inputInteger(String text) {
        String value = input(text);     // Get user's response
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user did not enter a valid integer
        while (isInteger(value) == false) {
            value = input(ERROR + text);
        }
        int number = Integer.parseInt(value);       // Convert to integer
        return number;                              // Return number value
    }

    /**
     * Asks the user for a string input in a input dialog box
     *
     * @param text the text for the dialog box
     * @return a valid string
     */
    private static String input(String text) {
        // Store the user's response in a variable from what they typed into
        // a input dialog
        String value = JOptionPane.showInputDialog(null,
                text, TITLE, JOptionPane.PLAIN_MESSAGE);
        // Create an error message if they user did not enter a value correctly
        final String ERROR = "Error, please enter again\n\n";
        // Force a loop if the user left the dialog empty and clicked "ok" or
        // they clicked "cancel" or the "X"
        while (value == null || value.equals("")) {
            value = JOptionPane.showInputDialog(null, text, TITLE,
                    JOptionPane.PLAIN_MESSAGE);
        }
        return value;           // Once they have entered a value, return it
    }

    /**
     * Checks the value to see if it contains numerical characters or a "-"
     *
     * @param value the string of characters to check
     * @return is a number (true) or not (false)
     */
    private static boolean isInteger(String value) {
        // Convert string into array of char values (built-in string method)
        char[] characters = value.toCharArray();
        // Loop (traverse) through this array from start to end
        for (int i = 0; i < characters.length; i++) {
            // Read in the character at this index
            char character = characters[i];
            // Use built-in method to see if this character is a digit (0-9)
            if (Character.isDigit(character) == false) {
                // Character was not a digit, but is it the negative sign 
                if (characters[i] != '-') {
                    return false;       // Not a valid character for a integer
                }
            }
        }
        return true;                    // All characters valid for a integer
    }

}
