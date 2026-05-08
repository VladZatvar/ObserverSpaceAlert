/**
 * Ім'я: Затварський Владислав Іванович, ІН-24
 * Дисципліна: Об'єктно-орієнтоване програмування на мові Java
 * Назва завдання: Завдання 3. Шаблон проектування Observer
 * Кінцевий термін подання: -
 * Витрачений час: ~4 год.
 * Ствердження: Завдання виконано особисто мною.
 * Під час підготовки використовувався інструмент ШІ як допоміжний засіб
 * для пояснення логіки, перевірки структури та оформлення коду.
 *
 * Опис програми:
 * Програма моделює систему сповіщення екіпажу космічної станції
 * про зміну рівня небезпеки.
 *
 * У першій частині показано реалізацію без патерна Observer.
 * У другій частині показано реалізацію з використанням патерна Observer.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("ПРОГРАМА 1: БЕЗ ПАТЕРНА OBSERVER");
        System.out.println("======================================");

        AlertSystemWithoutObserver oldAlertSystem = new AlertSystemWithoutObserver();

        oldAlertSystem.setDangerLevel("WARNING");
        oldAlertSystem.setDangerLevel("CRITICAL");

        System.out.println("\n======================================");
        System.out.println("ПРОГРАМА 2: З ПАТЕРНОМ OBSERVER");
        System.out.println("======================================");

        SpaceAlertSystem alertSystem = new SpaceAlertSystem();

        Observer commander = new CommanderObserver();
        Observer engineer = new EngineerObserver();
        Observer medic = new MedicObserver();

        alertSystem.addObserver(commander);
        alertSystem.addObserver(engineer);
        alertSystem.addObserver(medic);

        alertSystem.setDangerLevel("WARNING");
        alertSystem.setDangerLevel("CRITICAL");

        System.out.println("\nВідписуємо медика від системи сповіщень.");
        alertSystem.removeObserver(medic);

        alertSystem.setDangerLevel("NORMAL");
    }
}