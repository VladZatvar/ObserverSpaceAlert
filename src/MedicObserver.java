// Клас MedicObserver описує медика як спостерігача.
// Він отримує повідомлення про зміну рівня небезпеки
// та реагує з точки зору безпеки екіпажу.
public class MedicObserver implements Observer {

    @Override
    public void update(String dangerLevel) {
        System.out.println("Медик отримав сповіщення [" + dangerLevel + "]: підготувати медичний відсік та перевірити стан екіпажу.");
    }
}