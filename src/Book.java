public class Book implements MediaItem, Rentable {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private boolean available;

    public Book(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.available = true;
    }

    @Override
    public String getDisplayString() {
        return "Book: " + title + " by " + author + " (" + year + ") [ISBN: " + isbn + "]";
    }

    @Override
    public void rent() {
        if (available==true) {
            available = false;
            System.out.println("Book rented");
        }
        System.out.println("Book not available");
    }

    @Override
    public void returnItem() {
        if (available==false) {
            available = true;
            System.out.println("Book returned");
        }
        else {
            System.out.println("Book not rented");
        }
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}
