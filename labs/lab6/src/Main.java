public class Main {
    public static void main(String[] args) {
        // Создаём аналоговые часы
        AnalogClock analogClock = new AnalogClock(90, 180); // 90° - 3 часа, 180° - 30 минут

        // Подключаем адаптер
        ClockAdapter adapter = new ClockAdapter(analogClock);

        // Получаем цифровое время
        int hours = adapter.getHours();
        int minutes = adapter.getMinutes();

        // Отображаем время на цифровых часах
        DigitalClock digitalClock = new DigitalClock();
        digitalClock.displayTime(hours, minutes);
    }
}
