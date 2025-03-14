package lesson8;

public class MonthUtils {
    public static final Month january = new Month("January", 31, 23);
    public static final Month february = new Month("February", 28, 20);
    public static final Month march = new Month("March", 28, 20);
    public static final Month april = new Month("April", 28, 20);
    public static final Month may = new Month("May", 28, 20);
    public static final Month june = new Month("June", 28, 20);
    public static final Month july = new Month("July", 28, 20);
    public static final Month august = new Month("August", 28, 20);
    public static final Month september = new Month("September", 28, 20);


    public static Month[] year2025 = {january, february, march};

    public static Month[] getFirstQuarter() {
        return new Month[] {january, february, march};
    }

    public static Month[] getSecondQuarter() {
        return new Month[] {april, may, june};
    }

}
