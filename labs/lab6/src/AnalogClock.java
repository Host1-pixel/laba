public class AnalogClock {
    private int hourAngle; // Угол часовой стрелки
    private int minuteAngle; // Угол минутной стрелки

    public AnalogClock(int hourAngle, int minuteAngle) {
        this.hourAngle = hourAngle;
        this.minuteAngle = minuteAngle;
    }

    public int getHourAngle() {
        return hourAngle;
    }

    public int getMinuteAngle() {
        return minuteAngle;
    }
}
