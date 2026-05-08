// Клас EngineerObserver описує інженера як спостерігача.
// Він отримує повідомлення про зміну рівня небезпеки
// та реагує на технічний стан станції.
public class EngineerObserver implements Observer {

    @Override
    public void update(String dangerLevel) {
        System.out.println("Інженер отримав сповіщення [" + dangerLevel + "]: перевірити енергетичні та технічні системи.");
    }
}