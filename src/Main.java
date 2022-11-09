public class Main {
    public static void main(String[] args) {

        int amount = 100;
        int addCost = 1100;
        int bonus = addCost / 100;

        int totalAmount = amount + addCost + bonus;

        if (addCost == 100) {
            System.out.printf("Общая сумма с бонусом: " + (totalAmount - 1));
        } else {
            System.out.printf("Общая сумма с бонусом: " + totalAmount);
        }
    }
}