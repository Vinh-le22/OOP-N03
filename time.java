public class Time {
    private int hours;
    private int minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public void displayTime() {
        System.out.println("Time: " + hours + "h " + minutes + "m");
    }
}