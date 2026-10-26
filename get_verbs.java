import java.util.Scanner; 

// Asks the user for a verb and prints it back
public class get_verbs {

    public static void main(String[] args) {
        // Create a Scanner to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Call get_verb to ask for a verb, then save it in verb
        String verb = get_verb(scanner);

        // Print the verb the user typed
        System.out.println("You entered the verb: " + verb);

        scanner.close();
    }

    // Asks the user for one verb and returns it to main
    public static String get_verb(Scanner scanner) {
        System.out.print("Enter a verb: ");
        String verbInput = scanner.nextLine(); // Read the whole line the user types
        return verbInput; // Send the verb back to main
    }
}
