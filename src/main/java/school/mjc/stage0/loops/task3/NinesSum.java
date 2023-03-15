package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        var term = 0;
        var sum = 0;

        for (var termSize = 0; termSize < lengthOfLastNumber; termSize++) {
            term = term * 10 + 9;
            sum += term;
        }

        System.out.println(sum);
    }
}
