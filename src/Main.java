public class Main {
    public static void main(String[] args) {
        int initialBalance = 100; // Начальная сумма на счету в рублях
        int replenishAmount = 1100; // Сумма пополнения счета в рублях
        int bonusAmount; // Количество бонусных рублей
        int totalBalance; // Итоговый баланс счета

        if (replenishAmount > 1000) {
            bonusAmount = replenishAmount / 100;
        } else {
            bonusAmount = 0;
        }

        totalBalance = initialBalance + replenishAmount + bonusAmount;

        System.out.println("Итоговый баланс счета в рублях: " + totalBalance);
        System.out.println("Из них бонусных рублей: " + bonusAmount);
    }
}
