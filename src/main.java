public class main {
    // Сотовый оператор дарит по 1 бонусному рублю
    // за каждые 100 рублей пополнения,если счет пополнен более чем на 1000 рублей

    public static void main(String[] args) {

        int initialAccount = 200; // Начальный счёт клиента.
        int depositAmount = 1200; // Сумма пополнения.
        boolean bonus = depositAmount > 1000;

        int bonusAmount = bonus ? depositAmount / 100 : 0;
        int finalAccount = initialAccount + depositAmount + bonusAmount;

        System.out.println("Начисленные бонусы:" + bonusAmount + "рублей");
        System.out.println("Итоговая сумма: " + finalAccount + "рублей");
    }
}
