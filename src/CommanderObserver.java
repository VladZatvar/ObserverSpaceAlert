// Клас CommanderObserver описує командира як спостерігача.
// Він реалізує інтерфейс Observer, тому повинен мати метод update().
public class CommanderObserver implements Observer {

    @Override
    public void update(String dangerLevel) {
        System.out.println("Командир отримав сповіщення [" + dangerLevel + "]: оцінити ситуацію та віддати накази екіпажу.");
    }
}