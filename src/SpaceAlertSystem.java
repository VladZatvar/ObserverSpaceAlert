import java.util.ArrayList;
import java.util.List;

// Клас SpaceAlertSystem — це об'єкт, за яким спостерігають.
// У термінах патерна Observer його можна назвати Subject.
public class SpaceAlertSystem {
    private String dangerLevel;

    // Список усіх спостерігачів, які підписані на повідомлення системи.
    private List<Observer> observers;

    public SpaceAlertSystem() {
        this.dangerLevel = "NORMAL";
        this.observers = new ArrayList<>();
    }

    // Додає нового спостерігача до списку підписників.
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Видаляє спостерігача зі списку підписників.
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Змінює рівень небезпеки і повідомляє всіх підписників.
    public void setDangerLevel(String dangerLevel) {
        this.dangerLevel = dangerLevel;

        System.out.println("\nРівень небезпеки змінено на: " + dangerLevel);

        notifyObservers();
    }

    // Повідомляє всіх спостерігачів про зміну рівня небезпеки.
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(dangerLevel);
        }
    }

    public String getDangerLevel() {
        return dangerLevel;
    }
}