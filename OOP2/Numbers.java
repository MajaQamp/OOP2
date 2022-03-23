package OOP;

import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    ArrayList<Integer> listOfNumbers;


    public Numbers(ArrayList<Integer> listOfNumbers) {
        this.listOfNumbers = listOfNumbers;
    }


    public int maxNumber() {

        Integer max = Collections.max(listOfNumbers);
        return max;
    }

    public int minNumber() {

        Integer min = Collections.min(listOfNumbers);
        return min;
    }

    public int sumOfNumbers() {
        int sumOfAllNumbers = 0;
        for (Integer number : listOfNumbers) {
            sumOfAllNumbers = sumOfAllNumbers + number.intValue();
        }
        return sumOfAllNumbers;
    }

    public void checkPrimeNumber() {
        for (Integer number : listOfNumbers) {
            if (isPrimeNumber(number)) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println((number + " is not a prime number"));
            }
        }
    }

    private boolean isPrimeNumber(Integer number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
