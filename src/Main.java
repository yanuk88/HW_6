import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arr = generateRandomArray();

        //exercise 1
        int[] money = arr;
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Потраченная сумма за месяц - " + sum + " рублей");

        //exercise 2
        int maxOutlay = - 1;
        int minOutlay = 5000_000;
        for (int i = 0; i < money.length; i++) {
            if (money[i] > maxOutlay) {
                maxOutlay = money[i];
            }
            if (money[i] < minOutlay) {
                minOutlay = money[i];
            }
        }
        System.out.println("Максимальная трата задень - " + maxOutlay + " рублей");
        System.out.println("Минимальная трата задень - " + minOutlay + " рублей");

        //exercise 3
        float average = (float)sum/money.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        //exercise 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
            
        }
        

    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }


}