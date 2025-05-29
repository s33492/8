public interface Rentable {
    int MAX_RENTAL_DAYS = 14;
    void rent();
    void returnItem();
    boolean isAvailable();
    static double calculateLateFee(int daysLate) {
        return daysLate * 0.50;
    }
}
