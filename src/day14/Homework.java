package day14;

public class Homework {

    //Task 1. write a for loop that finds an maximum for the array
    //Task 2. write a for loop that finds an minimum for the array
    //Task 3. write a for loop that finds an average for the array
    // int[] myArray = {34,5,6,2,3,78,1}
    //OUTPUT: average: (34+5+6+2+3+78+1)/7

    public static void main(String[] args) {
        int[] myArray = {34, 5, 6, 2, 3, 78, 1};

        System.out.println("TASK1-------------------------------------");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            int currentNumber = myArray[i];
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        System.out.println("Max: " + max);

        System.out.println("TASK2-------------------------------------");
        int min = Integer.MAX_VALUE;
        for (int currentNumber : myArray) {
            if (currentNumber < min) {
                min = currentNumber;
            }
        }
        System.out.println("Min: " + min);

        System.out.println("TASK3-------------------------------------");
        int sum = 0;
        for (int currentNumber : myArray) {
            sum += currentNumber;
        } // 0 + 34 + 5 + 6 + 2 + 3 + 78 + 1

        double average = (double) sum / myArray.length;
        System.out.println("Average:  " + average);
    }
}

