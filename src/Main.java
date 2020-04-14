public class Main {
    public static void main(String[] args) {
        int accountBalance = 100;
        int refill = 1000;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int amount = accountBalance + bonus + refill;
        //итоговый бонус
        System.out.println(bonus);
        //общая сумма с учетом бонуса
        System.out.println(amount);
    }
}