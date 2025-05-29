public class Main {
    public static void main(String[] args) {
// Display library name
        System.out.println("Welcome to " + MediaItem.LIBRARY_NAME);
        System.out.println("Maximum rental period: " + Rentable.MAX_RENTAL_DAYS + " days\n");
// Create and test a book
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-0-7432-7356-5");
        System.out.println(book1.getDisplayString());
        System.out.println("Available: " + book1.isAvailable());
// Rent the book
       book1.rent();

        System.out.println("Available after rental: " + book1.isAvailable());
// Calculate late fee
        System.out.println("Late fee for 3 days: $" + Rentable.calculateLateFee(3));
// Return the book
        book1.returnItem();
        System.out.println("Available after return: " + book1.isAvailable() + "\n");
// Create and test a movie
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 148);
        System.out.println(movie1.getDisplayString());
// Add ratings to the movie
        movie1.setRating(5);
        movie1.setRating(4);
        movie1.setRating(5);
        System.out.println("Average rating: " + movie1.getAverageRating() + " stars");
// Rent the movie
        movie1.rent();

// Try to rent again (should fail)
        movie1.rent();
    }
}
