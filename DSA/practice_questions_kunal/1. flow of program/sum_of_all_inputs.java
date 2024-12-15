import java.util.*;

public class sum_of_all_inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers to sum. Enter 'x' to stop.");

        while (true) {
            String input = scanner.nextLine(); 
            
            if (input.equalsIgnoreCase("x")) { 
                break; 
            }

            try {
                int number = Integer.parseInt(input); 
                sum += number; 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }

        System.out.println("The sum of all entered numbers is: " + sum);
        scanner.close(); 
    }
}

