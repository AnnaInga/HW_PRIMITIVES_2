public class Main {
    public static void main(String[] args) {

        int account = 100; // начальный счет клиента (руб)
        int amount = 1100; // сумма пополнения (руб)
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Ваш итоговый счет: " + (account + amount + bonus));
        System.out.println("Начислено бонусов: " + bonus);
    }
}
