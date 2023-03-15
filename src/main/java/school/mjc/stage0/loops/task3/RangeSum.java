package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        var sum = 0;
        for (var term = firstBoarder; term <= secondBoarder; term++) {
            sum += term;
        }
        System.out.println(sum);
    }
}
