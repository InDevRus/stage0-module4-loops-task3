package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        var previous1 = 1;
        var previous2 = 0;

        if (1 < lastFibonacci) {
            System.out.println(previous2);
        }

        if (2 < lastFibonacci) {
            System.out.println(previous1);
        }

        for (int i = 3; i <= lastFibonacci; i++) {
            var newElement = previous1 + previous2;
            System.out.println(newElement);
            previous2 = previous1;
            previous1 = newElement;
        }
    }
}
