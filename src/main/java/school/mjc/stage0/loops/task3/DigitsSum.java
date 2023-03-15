package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        number = Math.abs(number);
        var digitsSum = 0;

        while (number > 0) {
            digitsSum += number % 10;
            number = number / 10;
        }

        System.out.println(digitsSum);
    }
}
