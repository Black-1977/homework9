public class Main {
    public static void main(String[] args) {

        int[] expenses = {45_000, 35_000, 103_000, 86_500, 0};

        // Part 1
        System.out.println("Задание 1");
        int sumExpenses = 0;
        for (int element : expenses) {
            sumExpenses += element;
        }
        System.out.println("Сумма расходов за месяц составила " + sumExpenses + " рублей");
        System.out.println();

        // Part 2
        System.out.println("Задание 2");
        int minExpense = expenses[0], maxExpense = 0;
        for (int element : expenses) {
            if (element < minExpense && element > 0) {
                minExpense = element;
            }
            if (element > maxExpense) {
                maxExpense = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExpense + " рублей");
        System.out.println();

        // Part 3
        System.out.println("Задание 3");
        int averageExpense;
        int quantityExpenses;
        if (expenses[4] == 0){
            quantityExpenses = 4;
        } else {
            quantityExpenses = 5;
        }
        averageExpense = sumExpenses / quantityExpenses;
        System.out.println("Средняя сумма трат за неделю составила " + averageExpense + " рублей");
        System.out.println();

        // Part 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = temp;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }
        System.out.println();

    }
}