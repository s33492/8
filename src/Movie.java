import java.util.ArrayList;
import java.util.List;

public class Movie implements MediaItem, Rentable, Rateable {
    private String title;
    private String director;
    private int year;
    private int duration; // in minutes
    private boolean available;
    private List<Integer> ratings;

    public Movie(String title, String director, int year, int duration) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.duration = duration;
        this.available = true;
        this.ratings = new ArrayList<>();
    }

    @Override
    public String getDisplayString() {
        return "Movie: " + title + " directed by " + director + " (" + year + "), " + duration + " mins";
    }

    @Override
    public void rent() {
        if (available==true) {
            available = false;
            System.out.println("Movie rented");
        }
        else {
            System.out.println("Movie not available");
        }
    }

    @Override
    public void returnItem() {
        if (available==false) {
            available = true;
            System.out.println("Movie returned");
        }
        else {
            System.out.println("Movie not rented");
        }
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        }
    }

    @Override
    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int total = 0;
        for (int r : ratings) {
            total += r;
        }
        return (double) total / ratings.size();
    }
}
