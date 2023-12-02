package java_fundamentals;

public class DoWhileLoop {
	public static void main(String[] args) {
	 // Initialize a counter variable
    int counter = 5 ;

    // Use a do-while loop to print numbers from 1 to 5
    do {
        System.out.println("Number: " + counter);

        // Increment the counter
        counter++;
    } while (counter <= 10);
}
}