//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x = 500;

        int y = 2_000_000;

        int bonus;

        if (y > 1000) {
            bonus = y / 100;
        } else {
            bonus = 0;
        }
        int balance = x + y + bonus;
        System.out.println("Итоговый баланс: " + balance);
        System.out.println("Количество бонусов: " + bonus);


    }
}