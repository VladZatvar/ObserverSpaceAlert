// Програма 1: реалізація без використання патерна Observer.
// У цій версії система сповіщення напряму викликає повідомлення
// для кожного члена екіпажу.

public class AlertSystemWithoutObserver {
    private String dangerLevel;

    public AlertSystemWithoutObserver() {
        this.dangerLevel = "NORMAL";
    }

    public void setDangerLevel(String dangerLevel) {
        this.dangerLevel = dangerLevel;

        System.out.println("\nРівень небезпеки змінено на: " + dangerLevel);

        notifyCommander();
        notifyEngineer();
        notifyMedic();
    }

    private void notifyCommander() {
        System.out.println("Командир отримав повідомлення: перевірити загальну ситуацію на станції.");
    }

    private void notifyEngineer() {
        System.out.println("Інженер отримав повідомлення: перевірити технічні системи.");
    }

    private void notifyMedic() {
        System.out.println("Медик отримав повідомлення: підготувати медичний відсік.");
    }

    public String getDangerLevel() {
        return dangerLevel;
    }
}