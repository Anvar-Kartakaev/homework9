public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание №9");

        //Task 1
        System.out.println("\nЗадание №1:");
        float[] accountBook = {12_504.55f, 13_457.32f, 10_944.67f, 19_349.01f, 15_473.96f};
        float sum = 0;
        for (final float element : accountBook) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        //Task 2
        System.out.println("\nЗадание №2:");
        float minSum = accountBook[0];
        float maxSum = accountBook[0];
        for (final float element : accountBook) {
            if (element > maxSum) { //Ищем максимум
                maxSum = element;
            } else if (element < minSum) { //Ищем минимум
                minSum = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей");


        //Task 3
        System.out.println("\nЗадание №3:");
        float averageSum = 0;
        for (float i = 0; i < accountBook.length; i++) {
            i = accountBook.length; // Кол-во недель
            for (final float element : accountBook) {
                averageSum += element; // Общая сумма
            }
            averageSum = averageSum / accountBook.length; // Среднее значение
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");


        //Task 4
        System.out.println("\nЗадание №4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}