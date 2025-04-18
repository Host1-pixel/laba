public class ClockAdapter {
    private AnalogClock analogClock;

    public ClockAdapter(AnalogClock analogClock) {
        this.analogClock = analogClock;
    }

    public int getHours() {
        return analogClock.getHourAngle() / 30; // 30 градусов = 1 час
    }

    public int getMinutes() {
        return analogClock.getMinuteAngle() / 6; // 6 градусов = 1 минута
    }
}
